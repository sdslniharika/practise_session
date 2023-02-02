package org.example.service;

import org.example.dao.TicketDao;
import org.example.dao.TicketDaoImp;
import org.example.entity.BusDetails;
import org.example.entity.Passenger;
import org.example.entity.Ticket;
import org.example.exception.TicketNotFoundExcpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImp implements TicketService {
    TicketDao ticketDao;
    BusServiceImp busService;

    @Autowired
    public TicketServiceImp(TicketDao ticketDao, BusServiceImp busService) {
        this.ticketDao = ticketDao;
        this.busService = busService;
    }

    private int generateId = 0;

    private int generatedId() {
        return ++generateId;
    }

    public int buyTicket(int busId, int noOfPassengers, List<Passenger> passengerList) {

        BusDetails busDetails = busService.printBusDetails(busId);

        int ticketId = generatedId();
        Ticket ticket = new Ticket();
        ticket.setBusDetails(busDetails);
        ticket.setNoOfSeats(noOfPassengers);
        ticket.setPassengers(passengerList);
        ticket.setTotalAmount(busDetails.getTicketCost() * noOfPassengers);
        ticketDao.addTicket(ticketId, ticket);
        return ticketId;

    }

    public Ticket printTicket(int ticketId) {
        Optional<Ticket> ticket = ticketDao.getTicket(ticketId);
        if (ticket.isEmpty()) {
            throw new TicketNotFoundExcpetion("Ticket not Found");
        }
        return ticket.get();
    }

    public  List<Ticket> printAllTickets()
    {
       return ticketDao.getAllTickets();
    }
}
