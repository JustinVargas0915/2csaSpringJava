/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csa.samplefullstack.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JustinV
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring Justin";
    }
}
