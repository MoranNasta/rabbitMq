package com.example.demo.rabbitMq.receiver;

import com.example.demo.rabbitMq.receiver.configuration.RabbitMqConfiguration;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @RabbitListener(queues = RabbitMqConfiguration.QUEUE_NAME)
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}