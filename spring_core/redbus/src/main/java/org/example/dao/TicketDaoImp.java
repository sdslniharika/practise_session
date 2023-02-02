package org.example.dao;

import org.example.datastore.TicketDetailsStorage;
import org.example.entity.Ticket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Repository
public class TicketDaoImp implements TicketDao {

    public  void addTicket(int ticketId,Ticket ticket)
    {
       TicketDetailsStorage.ticketMap.put(ticketId,ticket);
    }

    public Optional<Ticket> getTicket(int ticketId)
    {
       Ticket ticket= TicketDetailsStorage.ticketMap.get(ticketId);
       if(ticket==null)
       {
           return Optional.empty();
       }
       return  Optional.of(ticket);
    }
    public List<Ticket> getAllTickets()
    {
        Collection<Ticket> ticketCollection =TicketDetailsStorage.ticketMap.values();
        List<Ticket> ticketList=new ArrayList<>();
        ticketList.addAll(ticketCollection);
        return ticketList;
    }
}
