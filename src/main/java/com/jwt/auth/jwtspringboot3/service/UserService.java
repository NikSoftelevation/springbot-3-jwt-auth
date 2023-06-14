package com.jwt.auth.jwtspringboot3.service;

import com.jwt.auth.jwtspringboot3.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private static final List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Nikhil Sharma", "nikhil.dev.in"));
        store.add(new User(UUID.randomUUID().toString(), "Rohit Sharma", "rohit.prod.in"));
        store.add(new User(UUID.randomUUID().toString(), "Shubham Banga", "shubham.stg.in"));
        store.add(new User(UUID.randomUUID().toString(), "Arjun Kumar", "arjun.test.in"));
    }
    public List<User> getAllUsers() {
        return store;
    }
}