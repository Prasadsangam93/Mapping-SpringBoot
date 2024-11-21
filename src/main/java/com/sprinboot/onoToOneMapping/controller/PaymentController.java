
package com.sprinboot.onoToOneMapping.controller;

import com.sprinboot.onoToOneMapping.entity.Payment;
import com.sprinboot.onoToOneMapping.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Endpoint to create a payment for a customer by customerId
    @PostMapping("/savePayment/{customerId}")
    public ResponseEntity<Payment> savePayment(@PathVariable Long customerId) {
        Payment savedPayment = paymentService.savePayment(customerId);
        return new ResponseEntity<>(savedPayment, HttpStatus.CREATED);
    }
}
