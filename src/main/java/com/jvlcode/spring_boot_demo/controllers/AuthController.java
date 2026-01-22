package com.jvlcode.spring_boot_demo.controllers;

import com.jvlcode.spring_boot_demo.entity.UserEntity;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth") //localhost:8080/auth
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @PostMapping("/login")     // auth/login
    public void login(@RequestBody UserEntity user) {

        //authenticate the user
        Authentication authentication = authManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())); //tells JWT to authenticate or not


    }

}
