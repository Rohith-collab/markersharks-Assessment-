package com.example.user_registration.service;

import com.example.user_registration.exception.UserAlreadyExistsException;
import com.example.user_registration.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private final Map<String, User> userStorage = new HashMap<>();
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void registerUser(User user) {
        if (userStorage.containsKey(user.getUsername())) {
            throw new UserAlreadyExistsException("User already exists");
        }

        // Encrypt password before storing
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userStorage.put(user.getUsername(), user);
    }
}
