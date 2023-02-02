package org.example.service;

import org.example.entity.BusDetails;

import java.time.LocalDate;
import java.time.LocalTime;

public interface BusService {
    public void addBusDetails(int busId, LocalDate dateOfArrival, LocalTime arrivalTime, LocalTime departureTime, String from,
                              String to, double ticketCost);
    public BusDetails printBusDetails(int busId);
}
