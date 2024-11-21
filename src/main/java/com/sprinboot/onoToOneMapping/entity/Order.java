package com.sprinboot.onoToOneMapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Order_Tab")
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    private  Long customerId;

    private  Long productId;

    private  Long  quantity;

    private  Double amount;

    private  Double totalAmount;

}
