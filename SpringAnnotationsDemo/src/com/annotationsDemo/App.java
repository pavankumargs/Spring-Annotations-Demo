package com.annotationsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println("Employee ID : "+employee.getEmployeeId());
		System.out.println("Employee Name : "+employee.getEmployeeName());
		System.out.println("Employee Department : "+employee.getDepartment());
		System.out.println("Employee Designation : "+employee.getDesignation());
		System.out.println("Employee Location : "+employee.getLocation());
		
	}
}
