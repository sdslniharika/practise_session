package org.example.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class BusDetails {
    int busId;
    LocalDate dateOfArrival;
    LocalTime arrivalTime;
    LocalTime departureTime;
    String from;
    String to;
    double ticketCost;

    public BusDetails()
    {

    }
    public BusDetails(int busId, LocalDate dateOfArrival, LocalTime arrivalTime, LocalTime departureTime, String from, String to, double ticketCost) {
        this.busId = busId;
        this.dateOfArrival = dateOfArrival;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.from = from;
        this.to = to;
        this.ticketCost = ticketCost;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    @Override
    public String toString() {
        return "BusDetails{" +
                "busId=" + busId +
                ", dateOfArrival=" + dateOfArrival +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", ticketCost=" + ticketCost +
                '}';
    }
}
