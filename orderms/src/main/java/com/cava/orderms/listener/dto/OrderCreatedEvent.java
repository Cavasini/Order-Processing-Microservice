package com.cava.orderms.listener.dto;


import com.cava.orderms.entity.OrderItem;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCliente,
                                List<OrderItemEvent> itens) {

}
