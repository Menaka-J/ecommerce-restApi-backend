package com.jvlcode.spring_boot_demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //tell we are ging to add imp config's
@EnableWebSecurity //used for enabling security
public class SecurityConfig {

    @Bean //using Bean , this class can be used in others code also
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { //get http which has all url
        http.authorizeHttpRequests(authz ->
                authz.requestMatchers("/api/users/**").authenticated() //tells we only want auth for this url's
                        .requestMatchers("/").permitAll() //tells we permit all to visit for this url's[here Home page]
        ).formLogin(form -> form.permitAll()); //permit default login page
        return http.build(); //tells SB we did this so build it
    }

}
