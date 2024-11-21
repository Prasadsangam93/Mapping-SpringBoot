package com.sprinboot.onoToOneMapping.service;

import com.sprinboot.onoToOneMapping.entity.Customer;
import com.sprinboot.onoToOneMapping.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
