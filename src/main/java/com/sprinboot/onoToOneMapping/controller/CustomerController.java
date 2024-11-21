package com.sprinboot.onoToOneMapping.controller;


import com.sprinboot.onoToOneMapping.entity.Customer;
import com.sprinboot.onoToOneMapping.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")

    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){

        Customer customer1= customerService.createCustomer(customer);
        return  new ResponseEntity<>(customer1, HttpStatus.CREATED);
    }

}
