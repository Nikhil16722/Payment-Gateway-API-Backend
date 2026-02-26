package com.payment.gateway.controller;

import com.payment.gateway.dto.UserRequestDTO;
import com.payment.gateway.dto.UserResponseDTO;
import com.payment.gateway.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(
            @Valid @RequestBody UserRequestDTO request) {

        return ResponseEntity.ok(userService.createUser(request));
    }
}