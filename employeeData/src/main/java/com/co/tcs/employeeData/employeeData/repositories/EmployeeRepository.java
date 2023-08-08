/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.tcs.employeeData.employeeData.repositories;

import com.co.tcs.employeeData.employeeData.models.Employee;
import java.util.List;

/**
 *
 * @author zarce
 */
public interface EmployeeRepository {
    
    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee user);
    
    public void update(Employee user);

    public void deleteById(int id);
    
}
