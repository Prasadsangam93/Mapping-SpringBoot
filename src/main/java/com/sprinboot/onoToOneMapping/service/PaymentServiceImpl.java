package com.sprinboot.onoToOneMapping.service;


import com.sprinboot.onoToOneMapping.entity.Order;
import com.sprinboot.onoToOneMapping.entity.Payment;
import com.sprinboot.onoToOneMapping.repository.OrderRepository;
import com.sprinboot.onoToOneMapping.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderRepository orderRepository;


    public Double calculateTotalAmount(Long customerId) {
        // Fetch all orders for the given customer
        List<Order> orders = orderRepository.findByCustomerId(customerId);

        // Sum up the totalAmount from all orders
        Double totalAmount = orders.stream()
                .mapToDouble(Order::getTotalAmount)  // Assuming each order has a 'totalAmount' field
                .sum();

        return totalAmount;
    }

    @Override
    public Payment savePayment(Long customerId) {

        Double totalAmount = calculateTotalAmount(customerId);

        // Create a new Payment entity
        Payment payment = new Payment();
        payment.setCustomerId(customerId);
        payment.setTotalAmount(totalAmount);

        // Save the payment
        return paymentRepository.save(payment);
    }


}