package com.model;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
public class Ticket {
    @Id
    @Column(name = "tcktId")
    private  int ticketId;

    @Column(name = "price")
    private int price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "eventId")
    private int eventId;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "eventId")
//    private int eventId;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "eventId")
//    private int eventId;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", price=" + price +
                ", quantity=" + quantity +
                ", eventId=" + eventId +
                '}';
    }
}
