package com.varun.CalendarApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.CalendarApp.dao.MeetingDao;
import com.varun.CalendarApp.model.MeetingModel;

@Service
public class MeetingService {
	
	@Autowired
	MeetingDao meetingDao;	
	public Long bookMeeting(MeetingModel meeting) {
		
		//Check if all employee emails are valid
		
		//If not return error response
		//If true, generate meeting id 
		//save to meetings db with email id
		//save to respective employee calendar with meeting id
		
		// TODO Auto-generated method stub
		return null;
	}
	

}
