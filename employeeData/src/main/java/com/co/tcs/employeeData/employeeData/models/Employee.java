/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.tcs.employeeData.employeeData.models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.ColumnTransformer;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author zarce
 */
@Entity
@Table(name = "employees")
@EntityListeners(AuditingEntityListener.class)
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "location_city")
    private int locationCity;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "date_birth")
    private LocalDate dateBirth;
    
    @Column(name = "telephone")
    private String telephone;
    
    @Column(name = "position_title")
    private String positionTitle;
    
    @Column(name = "hire_date")
    private LocalDate hireDate;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "salary")
    private double salary;
    
    @Column(name = "time_position")
    private int timePosition;

    public Employee() {
    }

    public Employee(int employeeId, String firstName, String middleName, String lastName, int locationCity, String address, LocalDate dateBirth, String telephone, String positionTitle, LocalDate hireDate, String email, double salary, int timePosition) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.locationCity = locationCity;
        this.address = address;
        this.dateBirth = dateBirth;
        this.telephone = telephone;
        this.positionTitle = positionTitle;
        this.hireDate = hireDate;
        this.email = email;
        this.salary = salary;
        this.timePosition = timePosition;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(int locationCity) {
        this.locationCity = locationCity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTimePosition() {
        return timePosition;
    }

    public void setTimePosition(int timePosition) {
        this.timePosition = timePosition;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", locationCity=" + locationCity + ", address=" + address + ", dateBirth=" + dateBirth + ", telephone=" + telephone + ", positionTitle=" + positionTitle + ", hireDate=" + hireDate + ", email=" + email + ", salary=" + salary + ", timePosition=" + timePosition + '}';
    }
    
}
