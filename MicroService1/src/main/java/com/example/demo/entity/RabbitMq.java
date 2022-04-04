package com.example.demo.entity;

public class RabbitMq {
	 int empId;
	    String empName;
	    String empRole;
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpRole() {
			return empRole;
		}
		public void setEmpRole(String empRole) {
			this.empRole = empRole;
		}
		@Override
		public String toString() {
			return "RabbitMq [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
		}
	    
}
