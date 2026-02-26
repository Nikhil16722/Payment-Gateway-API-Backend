package com.payment.gateway.service;

import com.payment.gateway.dto.UserRequestDTO;
import com.payment.gateway.dto.UserResponseDTO;

public interface UserService {

    UserResponseDTO createUser(UserRequestDTO request);
}