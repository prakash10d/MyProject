package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BusinessExceptionEntity;
import com.example.demo.exception.BusinessException;
import com.example.demo.service.BussinessExceptionService;
@RestController
public class BusinessExceptionController {
	@Autowired
	BussinessExceptionService exceptionService;
	@GetMapping("/get/exception/{userName}")
	public String getuserdetails( @PathVariable String userName) throws BusinessException{
		return exceptionService.getuserdetails(userName);
	}
	/*@PostMapping("/post/user")
	public String insertuserdetail(@RequestBody BusinessExceptionEntity exceptionentity) {
		return exceptionService.insertuserdetails(exceptionentity);

	}*/
	@PostMapping("/post/exception")
	public String insertdetail(@RequestBody   BusinessExceptionEntity exceptionentity)throws BusinessException{
	
		exceptionService.insertdetail(exceptionentity);
		return "insert successfully";
	}

}
