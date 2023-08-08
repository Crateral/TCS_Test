/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.tcs.employeeData.employeeData.controllers;

import com.co.tcs.employeeData.employeeData.models.Employee;
import com.co.tcs.employeeData.employeeData.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zarce
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {

        return employeeService.findAll();

    }

    @GetMapping("/employee/{employeeId}")
    public Employee getUser(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);

        if (employee == null) {
            throw new RuntimeException("User id not found -" + employeeId);
        }
        
        return employee;
    }
    
    @PostMapping("/employee")
    public Employee addUser(@RequestBody Employee employee) {
        System.out.println("Esta en el post");
        employee.setEmployeeId(0);

        employeeService.save(employee);

        return employee;

    }
    
    @PutMapping("/employee/{employeeId}")
    public Employee updateUser(@RequestBody Employee employee) {
        
        employeeService.update(employee);

        return employee;
    }
    
}
