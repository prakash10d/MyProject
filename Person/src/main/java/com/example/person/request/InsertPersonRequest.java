package com.example.person.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.model.Person;
import com.example.person.repository.PersonRepository;

@Service
public class InsertPersonRequest {
	@Autowired
	PersonRepository personRepository;
	
	public String insertpersondetails(Person person) {
		personRepository.save(person);
		return "insert Successfully";	
	}
    

}
