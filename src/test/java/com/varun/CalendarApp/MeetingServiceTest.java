package com.varun.CalendarApp;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.varun.CalendarApp.model.Meeting;
import com.varun.CalendarApp.service.MeetingService;

public class MeetingServiceTest {

	@Mock
	private MeetingService meetingService;

	@InjectMocks
	private MeetingServiceTest meetingServiceTest; 

	  
	@BeforeEach
	public void init() 
	{
		MockitoAnnotations.openMocks(this); 
	}

	
	@Test
	public void testBookMeeting() {
		Meeting meeting = new Meeting("Test meeting", LocalDateTime.now(), 1.5 , List.of("test@gmail.com","test1@gmail.com"));
		Long meetingId = meetingService.bookMeeting(meeting);
		assertNotEquals(meetingId,0L);
	}

	@Test
	public void testFindFreeSlots() {
	}

	@Test
	public void testCheckConflicts() {
	}
}
