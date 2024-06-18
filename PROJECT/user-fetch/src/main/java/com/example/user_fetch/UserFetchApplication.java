package com.example.user_fetch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.user_fetch.model") // Specify package where entities are located
public class UserFetchApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserFetchApplication.class, args);
    }
}
