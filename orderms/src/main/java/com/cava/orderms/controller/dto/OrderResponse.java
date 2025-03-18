package com.cava.orderms.controller.dto;

import com.cava.orderms.entity.Order;

import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total){


    public static OrderResponse fromEntity(Order order) {
        return new OrderResponse(order.getId(), order.getCustomerId(), order.getTotal());
    }
}
