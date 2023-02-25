package com.services;

import com.model.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventDetailsImpl implements EventDetails{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Event> getEventNames() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Event> eventList = session.createQuery("from Event", Event.class).list();
        transaction.commit();
        session.close();
        return eventList;
    }

    @Override
    public Event create(Event event) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(event);
        transaction.commit();
        session.close();
        return event;
    }

    @Override
    public Event getEventById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Event event = session.get(Event.class,id);
        session.close();
        return event;
    }

    @Override
    public Event updateEvent(Event event) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(event);
        transaction.commit();
        session.close();
        return event;
    }

    @Override
    public Event deleteEventById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Event event = session.get(Event.class, id);
        session.delete(event);
        transaction.commit();
        session.close();
        return event;
    }
}
