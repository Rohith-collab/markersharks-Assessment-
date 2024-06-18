package com.example.user_fetch.service;

import com.example.user_fetch.model.User;
import com.example.user_fetch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import javax.validation.Valid;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    

	public Optional<User> getUserByUsername(String username) {
	 
		return userRepository.findByUsername(username);
	}



	public User registerUser(@Valid User user) {
		// TODO Auto-generated method stub
		return null;
	}



	public Object fetchUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
