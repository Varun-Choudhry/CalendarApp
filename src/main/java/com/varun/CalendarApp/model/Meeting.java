package com.varun.CalendarApp.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Meeting {

	private Long meetingId;
	private String title;
	private LocalDateTime startTime;
	private Duration duration;
	private List<Employee> participants;
	
	public Meeting(Long meetingId, String title, LocalDateTime startTime, Duration duration,
			List<Employee> participants) {
		super();
		this.meetingId = meetingId;
		this.title = title;
		this.startTime = startTime;
		this.duration = duration;
		this.participants = participants;
	}
	
	public Long getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public List<Employee> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Employee> participants) {
		this.participants = participants;
	}
	
	
}
