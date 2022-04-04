package com.example.demo.config;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter ;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.ConnectionFactory;

@Configuration
public class ReceiverConfig {

    public static final String QUEUE = "message_queue";
    public static final String EXCHANGE = "message_exchange";
    public static final String ROUTING_KEY = "message_routingKey";
	

	@Bean
	Queue queue() {
		return new Queue(QUEUE);
	}

	@Bean
	DirectExchange exchange() {
		return new DirectExchange(EXCHANGE);
	}

	@Bean
	Binding binding(Queue queue, DirectExchange exchange) {	
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
	}

	@Bean
	public  MessageConverter  jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	
	@Bean
	public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		final RabbitTemplate template = new RabbitTemplate();
		template.setMessageConverter(jsonMessageConverter());
		return template;
	}





	

}
