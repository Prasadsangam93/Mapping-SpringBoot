package com.sprinboot.onoToOneMapping.service;

import com.sprinboot.onoToOneMapping.entity.Product;
import com.sprinboot.onoToOneMapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements  ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
