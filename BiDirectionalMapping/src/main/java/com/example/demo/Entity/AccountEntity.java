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
@Table(name ="AccountTable")
public class AccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long accoNo;
	String bankName;
	String accoType;
	String ifscNo;
	
	
	public AccountEntity(long accoNo, String bankName, String accoType, String ifscNo) {
		super();
		this.accoNo = accoNo;
		this.bankName = bankName;
		this.accoType = accoType;
		this.ifscNo = ifscNo;
	}
	public AccountEntity() {
		
	}
	@Override
	public String toString() {
		return "AccountEntity [accoNo=" + accoNo + ", bankName=" + bankName + ", accoType=" + accoType + ", ifscNo="
				+ ifscNo + ", student=" + student + "]";
	}
	@OneToOne(targetEntity = StudentEntities.class,cascade = CascadeType.ALL)
	private List<StudentEntities> student;
	

	public List<StudentEntities> getStudent() {
		return student;
	}
	public void setStudent(List<StudentEntities> student) {
		this.student = student;
	}
	public long getAccoNo() {
		return accoNo;
	}
	public void setAccoNo(long accoNo) {
		this.accoNo = accoNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccoType() {
		return accoType;
	}
	public void setAccoType(String accoType) {
		this.accoType = accoType;
	}
	public String getIfscNo() {
		return ifscNo;
	}
	public void setIfscNo(String ifscNo) {
		this.ifscNo = ifscNo;
	}
	
}
