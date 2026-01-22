package com.jvlcode.spring_boot_demo.security;

import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;

import javax.crypto.SecretKey;

public class JwtUtil {

    private static final String SECRET_KEY_STRING = "Z8xseQyBJv1Yi65UaT5bkDKeiua98R2o";  //secret jey for our site

    private final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(SECRET_KEY_STRING.getBytes()); //covert key to 256 bits for use


    public String generateToken(UserDetails userDetails) {

    }

}
