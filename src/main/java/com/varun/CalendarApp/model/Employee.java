package com.varun.CalendarApp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long employeeId;
	private String employeeEmailId;
	private String firstName;
	private String lastName;
	private Calendar calender;
	
	public Employee(int employeeId, String employeeEmailId, String firstName, String lastName, Calendar calender) {
		super();
		this.employeeId = employeeId;
		this.employeeEmailId = employeeEmailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.calender = calender;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeEmailId() {
		return employeeEmailId;
	}
	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Calendar getCalender() {
		return calender;
	}
	public void setCalender(Calendar calender) {
		this.calender = calender;
	}
	
	
	
	
	
}
