package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.model.Person;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/post/person")
	public String insertpersondetails(@RequestBody Person person) {
		return employeeService.insertpersondetails(person);
		
	}
	
	@PostMapping("/post/employee")
	public String insertemployeedetails(@RequestBody Employee employee) {
		return employeeService.insertemployeedetails(employee);
	
	}
	@PostMapping("/post/address")
	public String insertaddressdetails(@RequestBody Address address) {
		return employeeService.insertaddressdetails(address);
	
	}
	@PostMapping("/post/selectemployee")
	public String selectemployee(@RequestParam String email,@RequestParam String designation) {
		
		return employeeService.selectemployee(email,designation);
	
	}
	
	/*@PostMapping("/post/selectAddress")
	public String selectAddress(@RequestParam String location,@RequestParam String name) {
		 
		return employeeService.selectAddress(location,name);
	
	}
	
	@GetMapping("/get/email/{name}")
	public Address getByname(@PathVariable String name) {
		return employeeService.getByname(name);
		
	}
	*/
	@GetMapping("/get/email/{email}")
    public Employee getByEmail(@PathVariable String email) {
		return employeeService.getByEmail(email);
    	
    }
	
}
