/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.tcs.employeeData.employeeData.services;

import com.co.tcs.employeeData.employeeData.models.Employee;
import com.co.tcs.employeeData.employeeData.repositories.EmployeeRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zarce
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
    
        List<Employee> listUsers= employeeRepository.findAll();
        return listUsers;
    
    }

    @Override
    public Employee findById(int id) {
    
        Employee user = employeeRepository.findById(id);
        return user;
        
    }

    @Override
    public void save(Employee employee) {
    
        employeeRepository.save(employee);
    
    }
    
    @Override
    @Transactional
    public void update(Employee employee) {
    
        employeeRepository.update(employee);
    
    }

    @Override
    public void deleteById(int id) {
    
        employeeRepository.deleteById(id);
    
    }
    
}
