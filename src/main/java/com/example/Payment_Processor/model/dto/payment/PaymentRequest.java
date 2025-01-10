package com.example.Payment_Processor.model.dto.payment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PaymentRequest {
    @NotBlank
    private String transactionId;

    @NotNull
    @Positive
    private Double amount;

    @NotBlank
    private String currency;
}
