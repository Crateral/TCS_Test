/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.tcs.employeeData.employeeData.repositories;

import com.co.tcs.employeeData.employeeData.models.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zarce
 */
@Repository
@Transactional
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

        List<Employee> users = theQuery.getResultList();

        return users;

    }

    @Override
    public Employee findById(int id) {

        Session currentSession = entityManager.unwrap(Session.class);

        Employee user = currentSession.get(Employee.class, id);

        return user;

    }

    @Override
    public void save(Employee employee) {

        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.save(employee);

    }

    @Override
    public void update(Employee employee) {

        Session currentSession = entityManager.unwrap(Session.class);

        System.out.println("id0 " + employee.toString());

        currentSession.saveOrUpdate(employee);
        currentSession.flush(); // Realizar el flush para sincronizar con la BD

    }

    @Override
    public void deleteById(int id) {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> theQuery = currentSession.createQuery("delete from Employee where employeeId=:employeeId");

        theQuery.setParameter("employeeId", id);
        theQuery.executeUpdate();

    }

}
