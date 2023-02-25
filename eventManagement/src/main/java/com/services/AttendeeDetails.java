package com.services;

import com.model.Attendee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttendeeDetails {
    List<Attendee> getAttendeeNames();
    Attendee create(Attendee attendee);
    Attendee getAttendeeById(int attendeeId);
    Attendee updateAttendee(Attendee attendee);
    Attendee deleteAttendeeById(int attendeeId);
}
