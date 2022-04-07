package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.AccountEntity;
import com.example.demo.Entity.StudentEntities;
import com.example.demo.exception.BusinessException;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/post/student")
	public String insertstudentDetails(@RequestBody List<StudentEntities> student ) {
		return studentservice.insertstudentDetails(student);
		
	}
	@PostMapping("/post/account") 
	public String insertaccountdetails (@RequestBody List<AccountEntity> account ) {
		return studentservice.insertaccountdetails(account);
		
	}
	@PostMapping("/post/studname")
	public String accountdetailbystudentname(@RequestParam String studName,@RequestParam long accoNo) throws BusinessException {
		return studentservice.accountdetailbystudentname(studName, accoNo);	
		
	}
	@GetMapping("/get/{studName}")
	public Optional<StudentEntities> getByStudentName(@PathVariable String studName ) {
		return studentservice.getByStudentName(studName);
		
	}
	@GetMapping("/get/accoNo")
	public Optional<AccountEntity> getByAccountNo(@PathVariable long accoNo){
		return studentservice.getByAccountNo(accoNo);
		
	}
	

}
