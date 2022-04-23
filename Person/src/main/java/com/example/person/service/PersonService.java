package com.example.person.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.model.Address;
import com.example.person.model.Employee;
import com.example.person.model.Person;
import com.example.person.repository.AddressRepository;
import com.example.person.repository.EmployeeRepository;
import com.example.person.repository.PersonRepository;
import com.example.person.request.InsertAddressRequest;
import com.example.person.request.InsertEmployeeRequest;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public String insertPersonRequest(Person person) {
		personRepository.save(person);
		return "insert Successfully";	
	}
	public String insertEmployee(InsertEmployeeRequest insertEmployeeRequest) {
		
		if (personRepository.existsByMobileNumber(insertEmployeeRequest.getMobileNumber())) {
			Employee employee = new Employee();
			employee.setDesignation(insertEmployeeRequest.getDesignation());
			employee.setSalary(insertEmployeeRequest.getSalary());
			employee.setExperience(insertEmployeeRequest.getExperience());
			employeeRepository.save(employee);
			return "insertSuccessfully";
		}
		
		return "failed";
		
	}
public String insertAddress(InsertAddressRequest insertAddressRequest) {
		
		if (employeeRepository.existsByExperience(insertAddressRequest.getExperience())) {
			Address address = new Address();
			address.setLandmark(insertAddressRequest.getLandmark());
			address.setLocation(insertAddressRequest.getLandmark());
			address.setPincode(insertAddressRequest.getPincode());
			addressRepository.save(address);
		
			return "insertSuccessfully";
		}
		
		return "failed";
		
	}
	
	public String findEmployeByMobileNumber (String mobileNumber ,String designation) {
		   Optional<Person>per=personRepository.findByMobileNumber(mobileNumber);
		   Optional<Employee>emp=employeeRepository.findByDesignation(designation);
		   System.out.println("insert");
		   if (per.isPresent()&& emp.isPresent()) {
			   Person person = per.get();
			   person.setEmployee(emp.get());
			   
			   Employee employee = emp.get();
			   employee.setPerson(per.get());
			  
	           personRepository.save(person);
	           employeeRepository.save(employee);
	           
	           return "insert successfully";
			
		}

		return "failed";
		
	}
	public String findAddressByMobileNumber (String experience ,String location) {
		Optional<Address>pers=addressRepository.findByLocation(location);
		   Optional<Employee>em=employeeRepository.findByExperience(experience);
		   
		   if (em.isPresent()&& pers.isPresent()) {
			   Employee employ = em.get();
			   Address add = pers.get();
			   
			   List<Address> addres = employ.getAddress();
			   addres.add(add);
			   
			   employ.setAddress(addres);
		   addressRepository.save(add);
			   
			  // add.setEmployee(employ);
		   employeeRepository.save(employ) ;
			  return "insert successfully"; 	   
				  
	}
		   return "failed";		
}

    public Optional<Person> findByMobileNumber(String mobileNumber) {
		return personRepository.findByMobileNumber(mobileNumber);
    	
    }
	public Employee getByMobileNumber(String mobileNumber){
		Optional<Person> pers = personRepository.findByMobileNumber(mobileNumber);
		if (pers.isPresent()) {
			return pers.get().getEmployee();
			
		}
		return null;
	}
	public List<Address> getByEmail(String experience){
		Optional<Employee> pe = employeeRepository.findByExperience(experience);
		if (pe.isPresent()) {
			
			return pe.get().getAddress();
			
		}
		return null;
		
	}
}
