package com.example.user_fetch.exception;

public class UserNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String username) {
        super("User not found with username: " + username);
    }
}
