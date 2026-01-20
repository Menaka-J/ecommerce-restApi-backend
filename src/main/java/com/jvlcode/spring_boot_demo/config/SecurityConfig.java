package com.jvlcode.spring_boot_demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
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


    //In-memeory AUth page details for learning purpose
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("alice") //UserDetails [build-in class for Auth learning], User[userdeatils object]
                .password("alice123")
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("zack")
                .password("admin123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin); //creating in-memory login details
    }

}
