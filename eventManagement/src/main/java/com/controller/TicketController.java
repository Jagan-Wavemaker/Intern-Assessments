package com.controller;
import com.model.Ticket;
import com.services.TicketServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping(value = "/ticket")
    public class TicketController {
    @Autowired
    TicketServices ticketServices;
    private static final Logger logger = LoggerFactory.getLogger(TicketController.class);

    @PostMapping("/create")
    public Ticket createTicket(@RequestBody Ticket ticket){
        logger.info("Create Ticket is invoked {}", ticket);
        return  ticketServices.createTicket(ticket);
    }
    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable("id") int ticketId){
        logger.info("getTicketById is invoked with Ticket Id : {}", ticketId);
        return ticketServices.getTicketById(ticketId);
    }
    @PutMapping("/update")
    public Ticket updateTicket(@RequestBody Ticket ticket){
        return  ticketServices.updateTicket(ticket);
    }
    @DeleteMapping("/{id}")
    public Ticket deleteTicketById(@PathVariable("id") int ticketId){
        return  ticketServices.deleteTicketById(ticketId);
    }

}
