package com.sprinboot.onoToOneMapping.service;

import com.sprinboot.onoToOneMapping.entity.Order;

public interface OrderService {


    Order saveOder(Long customerId, Long productId, Long quantity);


}
