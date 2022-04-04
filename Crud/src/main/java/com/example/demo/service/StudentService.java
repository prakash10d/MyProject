package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

	public List<StudentEntity> getStudentDetails(){
		return repository.findAll();
	}
	public String insertStudentDetails(StudentEntity studententity) {
		repository.save(studententity);

		return "insert successfully";
	}
	public String deleteStudentDetails(Integer id) {
		repository.deleteById(id);
		return "delete Successfully";
	}
	public  String updateStudentdetails(StudentEntity studententity) {
		repository.save(studententity);
		return "updated";
	}

}
