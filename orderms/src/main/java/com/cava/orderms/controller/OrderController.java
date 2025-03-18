package com.cava.orderms.controller;

import com.cava.orderms.controller.dto.ApiResponse;
import com.cava.orderms.controller.dto.OrderResponse;
import com.cava.orderms.controller.dto.PaginationResponse;
import com.cava.orderms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<ApiResponse<OrderResponse>> listOrders(@PathVariable("customerId") Long customerId,
                                                                 @RequestParam(name = "page", defaultValue = "0") Integer page,
                                                                 @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){


        var pageResponse = orderService.findAllByCustomerId(customerId, PageRequest.of(page, pageSize));

        return ResponseEntity.ok(new ApiResponse<>(
                pageResponse.getContent(),
                PaginationResponse.fromPage(pageResponse)
        ));
    }

}
