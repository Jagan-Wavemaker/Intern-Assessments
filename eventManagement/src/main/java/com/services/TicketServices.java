package com.services;

import com.model.Ticket;
import org.springframework.stereotype.Service;
@Service

public interface TicketServices {

    Ticket createTicket(Ticket ticket);
    Ticket getTicketById(int ticketId);
    Ticket updateTicket(Ticket ticket);

    Ticket deleteTicketById(int ticketId);
}
