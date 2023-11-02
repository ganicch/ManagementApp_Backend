package com.example.ManagementApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ManagementApp.model.User;
import com.example.ManagementApp.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }
    
    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
    
}
