package com.annotationsDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("employee")
public class Employee {
	
	@Value("${employeeId}")
	private int employeeId;
	
	@Value("${employeeName}")
	private String employeeName;
	
	@Value("${department}")
	private String department;
	
	@Value("${designation}")
	private String designation;
	
	@Value("${location}")
	private String location;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
