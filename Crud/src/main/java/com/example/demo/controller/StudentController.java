package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
@GetMapping("/view")
public List<StudentEntity> getStudentDetails()	
return service.getStudentDetails();
//	
//}
//@PostMapping("/insert")
//public String insertStudentDetails(@RequestBody StudentEntity  studententity) {
//	return service.insertStudentDetails(studententity); 
//}
//@DeleteMapping("/delete/{id}")
//public String deleteStudentDetails(@PathVariable Integer id) {
//	return service.deleteStudentDetails(id);
//	
//}
//@PutMapping("/update")
//public String updateStudentDetails(@RequestBody StudentEntity studententity) {
//	return service.updateStudentdetails(studententity);
//	
//}
	
}
