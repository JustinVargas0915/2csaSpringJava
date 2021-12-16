/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csa.samplefullstack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author JustinV
 */
@Entity
@Table(name="tbl_employee")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_Id;
    public String name;
    private String department;
    private String location;
    
    public Employee(Long employee_Id, String name, String department, String location)
    {
        this.employee_Id = employee_Id;
        this.name = name;
        this.department = department;
        this.location = location;
    }
    
    public Employee(){

    }

    public Long getEmployeeId(){
        return employee_Id;
    }

    public void setEmployeeId(Long employee_Id)
    {
        this.employee_Id = employee_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
