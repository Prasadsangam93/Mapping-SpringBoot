package com.sprinboot.onoToOneMapping.controller;


import com.sprinboot.onoToOneMapping.entity.Order;
import com.sprinboot.onoToOneMapping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/Orders")
@RestController
public class OrderController {

    @Autowired
     private OrderService orderService;

    @PostMapping("/save")
    public ResponseEntity<Order> saveOrder( @RequestParam  Long customerId, @RequestParam Long productId,@RequestParam Long quantity){
        Order order1 = orderService.saveOder(customerId, productId,quantity);
        return new ResponseEntity<>(order1, HttpStatus.CREATED);

    }
}
