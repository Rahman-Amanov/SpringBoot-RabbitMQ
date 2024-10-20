package com.springboot_rabbitmq.subscriber;

import com.springboot_rabbitmq.config.MessagingConfig;
import com.springboot_rabbitmq.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus){
        System.out.println("Message received from queue : "+orderStatus);
    }
}
