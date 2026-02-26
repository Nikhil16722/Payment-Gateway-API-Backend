package com.payment.gateway.controller;

import com.payment.gateway.dto.PaymentRequestDTO;
import com.payment.gateway.dto.PaymentResponseDTO;
import com.payment.gateway.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public ResponseEntity<PaymentResponseDTO> createPayment(
            @Valid @RequestBody PaymentRequestDTO request) {

        return ResponseEntity.ok(paymentService.createPayment(request));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<PaymentResponseDTO>> getPaymentsByUser(
            @PathVariable Long userId) {

        return ResponseEntity.ok(paymentService.getPaymentsByUser(userId));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<PaymentResponseDTO> updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        return ResponseEntity.ok(paymentService.updateStatus(id, status));
    }
}