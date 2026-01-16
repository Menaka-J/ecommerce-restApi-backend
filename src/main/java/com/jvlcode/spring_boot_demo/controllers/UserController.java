package com.jvlcode.spring_boot_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    //testing /api/users works in url
    public String getUsers() {
        return "Hello from Menaka";
    }


}
