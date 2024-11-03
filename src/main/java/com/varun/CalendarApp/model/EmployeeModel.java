package com.varun.CalendarApp.model;

public class EmployeeModel {
	
	private Long employeeId;
	private String employeeEmailId;
	private String firstName;
	private String lastName;
	private CalendarModel calender;
	
	public EmployeeModel(Long employeeId, String employeeEmailId, String firstName, String lastName, CalendarModel calender) {
		super();
		this.employeeId = employeeId;
		this.employeeEmailId = employeeEmailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.calender = calender;
	}
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
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
	public CalendarModel getCalender() {
		return calender;
	}
	public void setCalender(CalendarModel calender) {
		this.calender = calender;
	}
	
	
	
	
	
}
