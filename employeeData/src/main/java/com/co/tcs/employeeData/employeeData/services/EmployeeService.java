/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.tcs.employeeData.employeeData.services;

import com.co.tcs.employeeData.employeeData.models.Employee;
import java.util.List;

/**
 *
 * @author zarce
 */
public interface EmployeeService {
    
    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);
    
    public void update(Employee employee);

    public void deleteById(int id);
    
}
