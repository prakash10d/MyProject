package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studenttable2")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int regno;
	String name;
	int cgpa;
	String Dept;
	@OneToOne(targetEntity=CourseEntity.class,cascade = CascadeType.ALL)
	private CourseEntity Course;
	public CourseEntity getCourse() {
		return Course;
	}
	public void setFaculty(CourseEntity faculty) {
		this.Course = faculty;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String qualification) {
		this.Dept = qualification;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getcgpa() {
		return cgpa;
	}
	public void setcgpa(int cgpa) {
		this.cgpa = cgpa;
	}

}
