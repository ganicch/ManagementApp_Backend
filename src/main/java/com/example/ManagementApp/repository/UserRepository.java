package com.example.ManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ManagementApp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
