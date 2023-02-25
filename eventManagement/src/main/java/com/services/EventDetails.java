package com.services;

import com.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventDetails {
    List<Event> getEventNames();
    Event create(Event event);
    Event getEventById(int id);
    Event updateEvent(Event event);
    Event deleteEventById(int id);

}
