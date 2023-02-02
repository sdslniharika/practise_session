package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Ticket {
    BusDetails busDetails;
    int noOfSeats;
    @Autowired
    List<Passenger> passengers;
    double totalAmount;

    public  Ticket()
    {

    }
    public Ticket(BusDetails details, int noOfSeats, List<Passenger> noOfPassengers, double totalAmount) {
        this.busDetails = details;
        this.noOfSeats = noOfSeats;
        this.passengers = noOfPassengers;
        this.totalAmount = totalAmount;
    }

    public BusDetails getBusDetails() {
        return busDetails;
    }

    public void setBusDetails(BusDetails busDetails) {
        this.busDetails = busDetails;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "details=" + busDetails +
                ", noOfSeats=" + noOfSeats +
                ", noOfPassengers=" + passengers +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

