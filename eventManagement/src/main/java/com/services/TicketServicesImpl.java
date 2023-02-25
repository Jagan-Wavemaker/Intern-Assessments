package com.services;

import com.model.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServicesImpl implements TicketServices {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Ticket createTicket(Ticket ticket){
        Session session = sessionFactory.openSession();
        Transaction transaction  = session.beginTransaction();
        session.saveOrUpdate(ticket);
        transaction.commit();
        session.close();
        return  ticket;
    }
    @Override

    public Ticket getTicketById(int ticketId){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Ticket ticket = session.get(Ticket.class, ticketId);
        return ticket;
    }

    @Override
    public Ticket updateTicket(Ticket ticket){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(ticket);
        transaction.commit();
        session.close();
        return ticket;
    }

    @Override
    public  Ticket deleteTicketById(int ticketId){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Ticket ticket = session.get(Ticket.class, ticketId);
        session.delete(ticket);
        transaction.commit();
        session.close();
        return ticket;
    }

}
