package org.example.dao;

import org.example.entity.Ticket;
import java.util.List;
import java.util.Optional;

public interface TicketDao {
    public  void addTicket(int ticketId, Ticket ticket);

    public Optional<Ticket> getTicket(int ticketId);

    public List<Ticket> getAllTickets();
}
