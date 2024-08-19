package com.example.demo.rabbitmq.sender.service;

import com.example.demo.rabbitmq.sender.configuration.RabbitMqConfigutation;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {

    private RabbitTemplate rabbitTemplate;

    public RabbitService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public boolean sendMessageToRabbit(String message)
    {
        rabbitTemplate.convertAndSend(RabbitMqConfigutation.EXCHANGE_NAME, RabbitMqConfigutation.ROUTING_KEY, message);
        return true;
    }
}
