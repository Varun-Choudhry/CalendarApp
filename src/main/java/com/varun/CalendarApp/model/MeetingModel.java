package com.varun.CalendarApp.model;

import java.time.LocalDateTime;
import java.util.List;

public class MeetingModel {

	private Long meetingId;
	private String title;
	private LocalDateTime startTime;
	private Double duration;
	private List<String> participants;
	
	public MeetingModel(String title, LocalDateTime startTime, Double duration,
			List<String> participants) {
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
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public List<String> getParticipants() {
		return participants;
	}
	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}
	
	
}
