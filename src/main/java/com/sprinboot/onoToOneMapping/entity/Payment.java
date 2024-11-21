package com.sprinboot.onoToOneMapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Payment_tab")
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long paymentId;

    private  Long customerId;


    private Double totalAmount;


}
