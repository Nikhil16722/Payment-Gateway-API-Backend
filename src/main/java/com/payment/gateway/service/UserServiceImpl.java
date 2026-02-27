package com.payment.gateway.service;

import com.payment.gateway.model.User;
import com.payment.gateway.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {

        // Check if email already exists
        userRepository.findByEmail(user.getEmail())
                .ifPresent(existing -> {
                    throw new RuntimeException("Email already registered: " + user.getEmail());
                });

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    @Override
    public void deleteUser(Long id) {

        if (!userRepository.existsById(id)) {
            throw new RuntimeException("Cannot delete. User not found with id: " + id);
        }

        userRepository.deleteById(id);
    }
}