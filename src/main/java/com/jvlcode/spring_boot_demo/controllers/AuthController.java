package com.jvlcode.spring_boot_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth") //localhost:8080/auth
public class AuthController {

    @GetMapping("/login") /// auth/login
    public void login(){

    }

}
