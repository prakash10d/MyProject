package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "course_table")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_Id",nullable = false)
	int courseId;
	@Column(name ="course_Name",unique = true,nullable  = false)
	String courseName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="course_Id")
	private List<StudentEntity> student;


	public List<StudentEntity> getStudent() {
		return student;
	}
	public void setStudent(List<StudentEntity> student) {
		this.student = student;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}