package com.example.person.request;

public class InsertAddressRequest {
	String location;
	String landmark;
	String  pincode;
	String experience;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public InsertAddressRequest(String location, String landmark, String pincode, String experience) {
		super();
		this.location = location;
		this.landmark = landmark;
		this.pincode = pincode;
		this.experience = experience;
	}
	
	


}
