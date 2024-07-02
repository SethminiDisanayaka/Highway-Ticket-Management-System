package com.example.payment_service.services;

import com.example.payment_service.dto.PaymentDTO;


public interface PaymentServices {
    String confirmPayment(PaymentDTO paymentDTO);
}
