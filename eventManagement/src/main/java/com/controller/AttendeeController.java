package com.controller;

import com.model.Attendee;
import com.services.AttendeeDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/attendee")
public class AttendeeController {
    @Autowired
    AttendeeDetails AttendeeDetails;
    private static final Logger logger = LoggerFactory.getLogger(AttendeeController.class);

    @GetMapping
    public List<Attendee> getAttendeeNames() {
        logger.info("Attendees List");
        return AttendeeDetails.getAttendeeNames();
    }
    @PostMapping("/create")
    public Attendee createEvent(@RequestBody Attendee attendee){
        logger.info("Create Attendee is invoked {}", attendee);
        return AttendeeDetails.create(attendee);
    }
    @GetMapping("/{id}")
    public Attendee getEventById(@PathVariable("attendeeId") int attendeeId){
        logger.info("getEventById is invoked with attendee Id : {}", attendeeId);
        return  AttendeeDetails.getAttendeeById(attendeeId);
    }
    @PutMapping("/update")
    public  Attendee updateEvent(@RequestBody Attendee attendee){
        return  AttendeeDetails.updateAttendee(attendee);
    }
    @DeleteMapping("/{id}")
    public Attendee deleteAttendeeId(@PathVariable("attendeeId") int attendeeId){
        return  AttendeeDetails.deleteAttendeeById(attendeeId);
    }
}
