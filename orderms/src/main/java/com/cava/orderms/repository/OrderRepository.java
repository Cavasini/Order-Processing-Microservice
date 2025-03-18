package com.cava.orderms.repository;

import com.cava.orderms.controller.dto.OrderResponse;
import com.cava.orderms.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends MongoRepository<Order, Long> {
    Page<Order> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
