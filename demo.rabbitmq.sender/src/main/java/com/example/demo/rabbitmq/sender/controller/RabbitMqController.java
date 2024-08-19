package com.example.demo.rabbitmq.sender.controller;

import com.example.demo.rabbitmq.sender.service.RabbitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {

    private RabbitService rabbitService;

    public RabbitMqController(RabbitService rabbitService) {
        this.rabbitService = rabbitService;
    }

    @GetMapping("/{message}")
    public boolean hello(@PathVariable String message) {
    return rabbitService.sendMessageToRabbit("hello moran " +message);


    }

}
