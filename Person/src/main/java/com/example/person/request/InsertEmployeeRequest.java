package com.example.person.request;

public class InsertEmployeeRequest {
	int id;
	String experience;
	String designation;
	Long salary;
	String mobileNumber;
	
	public InsertEmployeeRequest(String designation, Long salary, String mobileNumber) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
