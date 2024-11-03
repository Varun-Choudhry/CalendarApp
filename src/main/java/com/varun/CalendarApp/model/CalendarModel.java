package com.varun.CalendarApp.model;

import java.util.List;

public class CalendarModel {
	
	private Employee owner;
	private List<Meeting> meetings;
	public CalendarModel(Employee owner, List<Meeting> meetings) {
		super();
		this.owner = owner;
		this.meetings = meetings;
	}
	public Employee getOwner() {
		return owner;
	}
	public void setOwner(Employee owner) {
		this.owner = owner;
	}
	public List<Meeting> getMeetings() {
		return meetings;
	}
	public void setMeetings(List<Meeting> meetings) {
		this.meetings = meetings;
	}
	
	
	
}
