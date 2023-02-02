package org.example.service;

import org.example.entity.Passenger;
import org.example.entity.Ticket;

import java.util.List;

public interface TicketService {
    public int buyTicket(int busId, int noOfPassengers, List<Passenger> passengerList);
    public Ticket printTicket(int ticketId);
    public List<Ticket> printAllTickets();
}
