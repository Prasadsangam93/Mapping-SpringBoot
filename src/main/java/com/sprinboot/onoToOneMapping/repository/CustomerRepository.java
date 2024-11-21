package com.sprinboot.onoToOneMapping.repository;

import com.sprinboot.onoToOneMapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {


    Optional<Customer> findByCustomerId(Long id);
}
