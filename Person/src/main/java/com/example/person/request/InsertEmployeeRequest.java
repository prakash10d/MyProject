package com.example.person.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.model.Employee;
import com.example.person.repository.EmployeeRepository;

@Service
public class InsertEmployeeRequest {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public String insertemployeedetails(Employee employee) {
		employeeRepository.save(employee);
		return "insert Successfully";	
	}

}
