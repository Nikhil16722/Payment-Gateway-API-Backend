package com.payment.gateway.service;

import com.payment.gateway.dto.PaymentRequestDTO;
import com.payment.gateway.dto.PaymentResponseDTO;
import com.payment.gateway.model.Payment;
import com.payment.gateway.model.User;
import com.payment.gateway.repository.PaymentRepository;
import com.payment.gateway.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;

    @Override
    public PaymentResponseDTO createPayment(PaymentRequestDTO request) {

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Payment payment = Payment.builder()
                .amount(request.getAmount())
                .status("SUCCESS")
                .paymentTime(LocalDateTime.now())
                .user(user)
                .build();

        Payment saved = paymentRepository.save(payment);

        return mapToDTO(saved);
    }

    @Override
    public List<PaymentResponseDTO> getPaymentsByUser(Long userId) {

        return paymentRepository.findByUserId(userId)
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    @Override
    public PaymentResponseDTO updateStatus(Long id, String status) {

        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment not found"));

        payment.setStatus(status);

        return mapToDTO(paymentRepository.save(payment));
    }

    private PaymentResponseDTO mapToDTO(Payment payment) {

        return PaymentResponseDTO.builder()
                .id(payment.getId())
                .amount(payment.getAmount())
                .status(payment.getStatus())
                .paymentTime(payment.getPaymentTime())
                .userId(payment.getUser().getId())
                .build();
    }
}