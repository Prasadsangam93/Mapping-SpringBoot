package com.sprinboot.onoToOneMapping.repository;

import com.sprinboot.onoToOneMapping.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order ,Long> {

    List<Order> findByCustomerId(Long customerId);
}
