package com.example.user_fetch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Make sure @Entity annotation is present
public class User {
    @Id
    private String username;
    private String name;
    private String email;

    // Constructors, getters, and setters

    public User() {}

    public User(String username, String name, String email) {
        this.username = username;
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
