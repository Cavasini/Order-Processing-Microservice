package com.cava.orderms.config;

import org.springframework.amqp.core.Declarable;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.json.Jackson2JsonEncoder;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_QUEUE = "order-queue";

    @Bean
    public Jackson2JsonMessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Declarable orderCreatedQueue(){
        return new Queue(ORDER_QUEUE);
    }
}
