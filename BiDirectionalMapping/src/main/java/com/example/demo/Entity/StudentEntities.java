package com.example.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "StudentTable")
public class StudentEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int studId;
	String studName;
	String studEmail;
	String studCourse;
	
	public StudentEntities(int studId, String studName, String studEmail, String studCourse) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studEmail = studEmail;
		this.studCourse = studCourse;
	}
	public StudentEntities() {
		
	}
	@OneToOne(targetEntity = AccountEntity.class,cascade = CascadeType.ALL)
	private List<AccountEntity> account ;
	

	public List<AccountEntity> getAccount() {
		return account;
	}
	public void setAccount(List<AccountEntity> accountentity) {
		this.account = accountentity;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public String getStudCourse() {
		return studCourse;
	}
	public void setStudCourse(String studCourse) {
		this.studCourse = studCourse;
	}
	

}
