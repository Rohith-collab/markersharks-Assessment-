package com.example.user_fetch.repository;

import com.example.user_fetch.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);
    // Define custom queries if needed
}
