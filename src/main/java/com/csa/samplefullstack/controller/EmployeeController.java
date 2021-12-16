/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csa.samplefullstack.controller;


import com.csa.samplefullstack.entity.Employee;
import com.csa.samplefullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



import javax.persistence.Id;
import java.util.List;

/**
 *
 * @author JustinV
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeFromId(@PathVariable Long employeeId){
        return employeeRepository.findById(employeeId).get();
    }

    @PutMapping("/employees")
    public Employee putEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/employee/{employeeId}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long employeeId){
        employeeRepository.deleteById(employeeId);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
