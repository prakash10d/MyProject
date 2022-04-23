package com.example.person.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.model.Address;
import com.example.person.model.Employee;
import com.example.person.model.Person;
import com.example.person.request.InsertAddressRequest;
import com.example.person.request.InsertEmployeeRequest;
import com.example.person.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@PostMapping("/post/person")
	public String insertPersonRequest(@RequestBody Person person) {
		return personService.insertPersonRequest(person);
		
	}
	@PostMapping("/post/employee")
	public String insertEmployeeRequest(@RequestBody InsertEmployeeRequest insertEmployeeRequest) {
		return personService.insertEmployee(insertEmployeeRequest);
	
	}
	@PostMapping("/post/address")
	public String insertAddress(@RequestBody InsertAddressRequest address) {
		return personService.insertAddress(address);
	
	}
	@GetMapping("/get/number/{mobileNumber}")
	public Optional<Person> findByMobileNumber(@PathVariable String mobileNumber) {
		return personService.findByMobileNumber(mobileNumber);
		
		
	}
	
	
	@PostMapping("/post/selectemployee")
	public String findEmployeeByMobileNumber(@RequestParam String mobileNumber,@RequestParam String designation) {
		
		return personService.findEmployeByMobileNumber(mobileNumber,designation);
	
	}
	
	@PostMapping("/post/selectaddress")
	public String findAddressByMobileNumber(@RequestParam String experience,@RequestParam String location) {
		
		return personService.findAddressByMobileNumber(experience,location);
	
	}
	
	
	@GetMapping("/get/num/{mobileNumber}")
    public Employee getByMobileNumber(@PathVariable String mobileNumber) {
		return personService.getByMobileNumber(mobileNumber);
    	
    }
	
	@GetMapping("/get/experience/{experience}")
    public List<Address> getByEmail(@PathVariable String experience) {
		return personService.getByEmail(experience);
   	
   }
   


}
