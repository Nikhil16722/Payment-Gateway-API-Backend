package com.payment.gateway.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class PaymentResponseDTO {

    private Long id;
    private BigDecimal amount;
    private String status;
    private LocalDateTime paymentTime;
    private Long userId;
}