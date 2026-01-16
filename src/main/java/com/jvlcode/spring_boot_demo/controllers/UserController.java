package com.jvlcode.spring_boot_demo.controllers;

import com.jvlcode.spring_boot_demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

//    @GetMapping
//    //testing /api/users works in url
//    public String getUsers() {
//        return "Hello from Menaka";
//    }

    //for showing users in /ap/users
    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(new User(1L, "menaka", "men@gmail.com"), new User(2L, "meena", "meena@gmail.com"));
    }

}
