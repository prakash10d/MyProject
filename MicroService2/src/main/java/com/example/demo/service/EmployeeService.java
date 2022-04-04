package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.config.ReceiverConfig;
import com.example.demo.repository.EmployeeRepository;

@Component
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	   @RabbitListener(queues = ReceiverConfig.QUEUE)
	    public void listener(EmployeeEntity employee) {
	        System.out.println(employee);
	        employeeRepository.save(employee);
	    }
}
