package com.controller;

import com.model.Event;
import org.slf4j.Logger;
import com.services.EventDetails;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/event")
public class EventController {
    @Autowired
    EventDetails eventDetails;
    private static final Logger logger = LoggerFactory.getLogger(EventController.class);

    @GetMapping
    public List<Event> getEventNames() {
        logger.info("Events List");
        return eventDetails.getEventNames();
    }
    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event){
        logger.info("Create Event is invoked {}", event);
        return eventDetails.create(event);
    }
    @GetMapping("/{id}")
    public Event getEventById(@PathVariable("id") int id){
        logger.info("getEventById is invoked with Event Id : {}", id);
        return  eventDetails.getEventById(id);
    }
    @PutMapping("/update")
    public  Event updateEvent(@RequestBody Event event){
        return  eventDetails.updateEvent(event);
    }
    @DeleteMapping("/{id}")
    public Event deleteEventId(@PathVariable("id") int id){
        return  eventDetails.deleteEventById(id);
    }
}
