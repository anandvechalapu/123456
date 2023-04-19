package com.testsdfsdfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsdfsdfsd.entity.User;
import com.testsdfsdfsd.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void deleteByUsername(String username) {
        userRepository.deleteByUsername(username);
    }

    public void deleteByEmail(String email) {
        userRepository.deleteByEmail(email);
    }

    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}