package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BusinessExceptionEntity;
import com.example.demo.exception.BusinessException;
import com.example.demo.exception.BusinessExceptionReason;
import com.example.demo.repository.BusinessExceptionRepository;

@Service
public class BussinessExceptionService {
	@Autowired
	BusinessExceptionRepository exceptionRepository;
	public String getuserdetails(String userName) throws BusinessException{

		Optional<BusinessExceptionEntity>op=exceptionRepository.findByuserName(userName);

		if(op.isPresent()) {
			return "user name found";
		}
		else {

			throw new BusinessException(BusinessExceptionReason.USER_NAME_NOT_FOUND.name(),

					BusinessExceptionReason.USER_NAME_NOT_FOUND);

		}
	}


	public String insertuserdetails(BusinessExceptionEntity exceptionentity) {
		exceptionRepository.save(exceptionentity);
		return "insert successfully";
	}
	public String insertdetail(BusinessExceptionEntity exceptionentity) throws BusinessException{
		String userName=exceptionentity.getUserName();
		Optional<BusinessExceptionEntity>op=exceptionRepository.findByuserName(userName);
		if(op.isPresent()) {
			throw new BusinessException(BusinessExceptionReason.USER_NAME_ALREADY_REGISTER.name(),

					BusinessExceptionReason.USER_NAME_ALREADY_REGISTER);
		}
		else {

			exceptionRepository.save(exceptionentity);
			return "successfully";
		}
	}



}
