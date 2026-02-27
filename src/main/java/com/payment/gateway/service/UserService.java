package com.payment.gateway.service;

import com.payment.gateway.model.User;

import java.util.List;

public interface UserService {

    // Create new user
    User createUser(User user);

    // Get all users
    List<User> getAllUsers();

    // Get single user by ID
    User getUserById(Long id);

    // Delete user
    void deleteUser(Long id);
}