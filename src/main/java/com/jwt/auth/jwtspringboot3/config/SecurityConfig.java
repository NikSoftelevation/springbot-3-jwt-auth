package com.jwt.auth.jwtspringboot3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails userDetails = User.builder()
                .username("Nikhil")
                .password(bCryptPasswordEncoder().encode("Nikhil@07@18"))
                .roles()
                .build();

        UserDetails userDetails1 = User.builder()
                .username("Nikhil_Sharma")
                .password(bCryptPasswordEncoder().encode("welcome@123"))
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(userDetails, userDetails1);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
