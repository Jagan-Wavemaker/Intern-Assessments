package com.services;

import com.model.Attendee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AttendeeDetailsImpl implements AttendeeDetails{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Attendee> getAttendeeNames(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Attendee> AttendeeList = session.createQuery("from Attendee", Attendee.class).list();
        transaction.commit();
        session.close();
        return  AttendeeList;
    }

    @Override
    public Attendee create(Attendee attendee){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(attendee);
        transaction.commit();
        session.close();
        return attendee;
    }

    @Override
    public Attendee getAttendeeById(int attendeeId){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Attendee attendee = session.get(Attendee.class, attendeeId);
        return attendee;
    }

    @Override
    public Attendee updateAttendee(Attendee attendee){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(attendee);
        transaction.commit();
        session.close();
        return attendee;
    }

    @Override
    public Attendee deleteAttendeeById(int attendeeId){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Attendee attendee = session.get(Attendee.class, attendeeId);
        session.delete(attendee);
        transaction.commit();
        session.close();
        return attendee;

    }
}
