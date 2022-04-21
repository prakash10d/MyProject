package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.model.Person;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.PersonRepository;

@Service
public class EmployeeService {
	@Autowired
	PersonRepository personrepository;

	@Autowired
	EmployeeRepository employeerepository;

	@Autowired
	AddressRepository addressrepository;

	public String insertpersondetails(Person person) {
		personrepository.save(person);
		return "insert Successfully";	
	}

	public String insertaddressdetails(Address address) {
		addressrepository.save(address);
		return "insert Successfully";	
	}
	public String insertemployeedetails(Employee employee) {
		employeerepository.save(employee);
		return "insert Successfully";	
	}
	
	public String selectemployee (String email ,String designation) {
		   Optional<Person>per=personrepository.findByEmail(email);
		   Optional<Employee>emp=employeerepository.findByDesignation(designation);
		   System.out.println("insert");
		   if (per.isPresent()&& emp.isPresent()) {
			   Person person = per.get();
			   person.setEmployee(emp.get());
			   
			   Employee employee = emp.get();
			   employee.setPerson(per.get());
			  
  	           personrepository.save(person);
  	           employeerepository.save(employee);
  	           
  	           return "insert successfully";
			 
			
		}

		return "failed";
		
	}
	public String selectAddress (String name ,String location) {
		Optional<Address>pers=addressrepository.findByLocation(location);
		   Optional<Employee>em=employeerepository.findByName(name);
		   
		   if (em.isPresent()&& pers.isPresent()) {
			   Employee employ = em.get();
			   Address add = pers.get();
			   
			   List<Address> addres = employ.getAddress();
			   addres.add(add);
			   
			   employ.setAddress(addres);
		   addressrepository.save(add);
			   
			  // add.setEmployee(employ);
		   employeerepository.save(employ) ;
			  return "insert successfully"; 	   
				  
	}
		   return "failed";		
}

	
	public Address getByName( String name) {
		return addressrepository.getByName(name);
		
	}
	
//	public Employee getByemail( String email) {
//		return employeerepository.getByEmail(email);
//		
//	}
	public Employee getByEmail(String email){
		Optional<Person> pers = personrepository.findByEmail(email);
		if (pers.isPresent()) {
			
			return pers.get().getEmployee();
			
		}
		return null;
		
	}
	
	
	
}

