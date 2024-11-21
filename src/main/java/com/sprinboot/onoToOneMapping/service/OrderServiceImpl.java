package com.sprinboot.onoToOneMapping.service;


import com.sprinboot.onoToOneMapping.entity.Customer;
import com.sprinboot.onoToOneMapping.entity.Order;
import com.sprinboot.onoToOneMapping.entity.Product;
import com.sprinboot.onoToOneMapping.repository.CustomerRepository;
import com.sprinboot.onoToOneMapping.repository.OrderRepository;
import com.sprinboot.onoToOneMapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Order saveOder(Long customerId, Long productId,Long quantity) {
        Customer customer = customerRepository.findByCustomerId(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        Product product = productRepository.findByProductId(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        double totalAmount = product.getAmount() * quantity;

        Order order = new Order();
        order.setCustomerId(customer.getCustomerId());
        order.setProductId(product.getProductId());
        order.setQuantity(quantity);
        order.setAmount(product.getAmount());
        order.setTotalAmount(totalAmount);


        return orderRepository.save(order);
    }

    }




