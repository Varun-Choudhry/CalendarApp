package com.varun.CalendarApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Participant {
	
	@Id	   
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private Long id; 
	    
	@ManyToOne
	@JoinColumn(name = "meetingId")	
	private Meeting meeting; 
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee; 
	
	
}
