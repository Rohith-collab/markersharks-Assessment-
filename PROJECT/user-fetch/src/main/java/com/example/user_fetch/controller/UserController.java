package com.example.user_fetch.controller;

import com.example.user_fetch.exception.UserNotFoundException;
import com.example.user_fetch.model.User;
import com.example.user_fetch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully with username: " + registeredUser.getUsername());
    }

    @GetMapping("/fetch")
    public ResponseEntity<User> fetchUser(@RequestParam String username) {
        Optional<User> optionalUser = Optional.empty();
        
        // Check if optionalUser contains a value, otherwise throw UserNotFoundException
        User user = optionalUser.orElseThrow(() -> new UserNotFoundException(username));

        return ResponseEntity.ok(user);
    }
}
