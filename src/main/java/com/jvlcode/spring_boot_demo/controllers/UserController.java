package com.jvlcode.spring_boot_demo.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.jvlcode.spring_boot_demo.entity.UserEntity;
import com.jvlcode.spring_boot_demo.model.User;
import com.jvlcode.spring_boot_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

//    @GetMapping
//    //testing /api/users works in url
//    public String getUsers() {
//        return "Hello from Menaka";
//    }

    //for showing users in /ap/users
    @GetMapping
    public List<UserEntity> getUsers() {
//        return Arrays.asList(new User(1L, "menaka", "men@gmail.com"), new User(2L, "meena", "meena@gmail.com"));
        return userRepository.findAll();
    }


    //for creating user in db
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        System.out.println("POST called for creatiion");
        return null;
    }
}


//@RequestBody annoation is used to get the data user enter [in postman we enter JSON data]
