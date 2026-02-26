package com.payment.gateway.service;

import com.payment.gateway.dto.PaymentRequestDTO;
import com.payment.gateway.dto.PaymentResponseDTO;

import java.util.List;

public interface PaymentService {

    PaymentResponseDTO createPayment(PaymentRequestDTO request);

    List<PaymentResponseDTO> getPaymentsByUser(Long userId);

    PaymentResponseDTO updateStatus(Long id, String status);
}