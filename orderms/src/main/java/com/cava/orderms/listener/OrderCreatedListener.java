package com.cava.orderms.listener;

import com.cava.orderms.listener.dto.OrderCreatedEvent;
import com.cava.orderms.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static com.cava.orderms.config.RabbitMqConfig.ORDER_QUEUE;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    @Autowired
    private OrderService orderService;

    @RabbitListener(queues = ORDER_QUEUE)
    public void Listen(Message<OrderCreatedEvent> message) {
        logger.info(message.getPayload().toString());

        orderService.save(message.getPayload());
    }
}
