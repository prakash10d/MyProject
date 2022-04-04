package com.example.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.rabbitmqConfig;
import com.example.demo.entity.RabbitMq;

@RestController
public class RabbitMqController {
	
	@Autowired
	RabbitTemplate template;
	
	@PostMapping("/send/message")
	public String sendMessage(@RequestBody RabbitMq rabbitmq) {
		template.convertAndSend(rabbitmqConfig.EXCHANGE, rabbitmqConfig.QUEUE, rabbitmq);
		
		 return "Message Published";
		
	}
	
	

}
