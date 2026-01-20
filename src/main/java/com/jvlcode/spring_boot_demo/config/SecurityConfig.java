package com.jvlcode.spring_boot_demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //tell we are ging to add imp config's
@EnableWebSecurity //used for enabling security
public class SecurityConfig {

    public SecurityFilterChain securityFilterChain(HttpSecurity http) {
        http.authorizeHttpRequests(authz -> authz.requestMatchers("/api/users/**").authenticated());
        return http.build();
    }

}
