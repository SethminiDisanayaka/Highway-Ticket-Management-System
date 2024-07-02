package com.example.payment_service.controller;

import com.example.payment_service.dto.PaymentDTO;
import com.example.payment_service.services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/payments")
public class PaymentController {

    @Autowired
    PaymentServices paymentServices;

    @PostMapping
    public void checkHealth(){
        System.out.println("Payment worked...");
    }

    @PostMapping
    @RequestMapping("/confirmPayment")
    public String confirmPayment(@RequestBody PaymentDTO paymentDTO){
        String confirmPaymentMassage = paymentServices.confirmPayment(paymentDTO);
        return confirmPaymentMassage;
    }

}
