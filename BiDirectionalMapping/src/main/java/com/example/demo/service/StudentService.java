package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.AccountEntity;
import com.example.demo.Entity.StudentEntities;
import com.example.demo.exception.BusinessException;
import com.example.demo.exception.BusinessExceptionReason;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentrepository;
	
	@Autowired
	AccountRepository accountrepository;
	
	public String insertstudentDetails ( List<StudentEntities> student) {
		 studentrepository.saveAll(student);
		 return "insert successfully";	
	}
	public String insertaccountdetails ( List<AccountEntity> account ) {
		accountrepository.saveAll(account);
		return "insert successfully";	
	}
	
	public String accountdetailbystudentname(String studName, long accoNo) throws BusinessException{
		Optional<StudentEntities>stud =studentrepository.findByStudName(studName);
		Optional<AccountEntity>acc =accountrepository.findByaccoNo(accoNo);
		
		if(stud.isPresent()&& acc.isPresent()) {
			StudentEntities studententity =stud.get();
			AccountEntity accountentity =acc.get();
			List<StudentEntities> std =accountentity.getStudent();
			std.add(studententity);
			List<AccountEntity> ac =studententity.getAccount();
			ac.add(accountentity);
			studententity.setAccount(ac);
			studentrepository.save(studententity);
			accountentity.setStudent(std);
			accountrepository.save(accountentity);
		    return "insert successfully";
		}
		else {
			throw new BusinessException(BusinessExceptionReason.USER_NAME_NOT_FOUND.name(),

					BusinessExceptionReason.USER_NAME_NOT_FOUND);

		}	
	}
	public Optional<StudentEntities> getByStudentName(String studName) {
				
		return studentrepository.findByStudName(studName);
		
	}
	public Optional<AccountEntity> getByAccountNo(long accoNo){
		return accountrepository.findByaccoNo(accoNo);
		
	}
				
}

