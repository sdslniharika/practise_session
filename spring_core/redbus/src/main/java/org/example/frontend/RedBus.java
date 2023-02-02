package org.example.frontend;

import org.example.entity.BusDetails;
import org.example.entity.Passenger;
import org.example.entity.Ticket;
import org.example.exception.BusNotFoundExcpetion;
import org.example.exception.TicketNotFoundExcpetion;
import org.example.service.BusService;
import org.example.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class RedBus {

    BusService busServiceImp;

    TicketService ticketServiceImp;
    @Autowired
    public RedBus(BusService busServiceImp, TicketService ticketServiceImp) {
        this.busServiceImp = busServiceImp;
        this.ticketServiceImp = ticketServiceImp;
    }

    public void run() {

        busServiceImp.addBusDetails(123, LocalDate.of(2023,02,01), LocalTime.of(10,30),LocalTime.of(10,40),"Rajahmundry","Hyderabad",950);

        BusDetails busDetails=busServiceImp.printBusDetails(123);

        System.out.println(busDetails);

        List<Passenger> passengers=new ArrayList<>();
        Passenger passenger=new Passenger("Niharika","WH1234YR","123HYIO",9654321);
        Passenger passenger1=new Passenger("Reethu","WH906HK","456UY",90876);

        passengers.add(passenger);passengers.add(passenger1);
        int ticketId= ticketServiceImp.buyTicket(123,2,passengers);

        System.out.println(ticketId);
        Ticket printTicket= ticketServiceImp.printTicket(ticketId);
      //  System.out.println(printTicket);
        System.out.println("----------Ticket Details-------");
        System.out.println("From : " + printTicket.getBusDetails().getFrom());
        System.out.println("To : " + printTicket.getBusDetails().getTo());

        System.out.println("Departure Date : " + printTicket.getBusDetails().getDateOfArrival());
        System.out.println("Departure Time : " + printTicket.getBusDetails().getDepartureTime());

        System.out.println("***********************************************************************************");

        System.out.println("Passenger Details  : " + printTicket.getPassengers());

        System.out.println("***********************************************************************************");
        System.out.println("Total amount : " + printTicket.getTotalAmount());
        System.out.println("------------------------------------------------------------------------------------");


        /*try {


            System.out.println("<<<<<<<<<<<<<<<<<<-------------------Welcome to REDBUS ------------------->>>>>>>>>>>>>>>");

            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            while (flag) {
                System.out.println("Select an option :");
                System.out.println(" 1. Enter Bus Details");
                System.out.println("2. Print Bus Details ");
                System.out.println("3. Buy Ticket");
                System.out.println("4. Print Ticket");
                System.out.println("5. Exit");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Enter bus number");
                        int busNumber = sc.nextInt();
                        System.out.println("Enter Date of Arrival yyyy-mm-dd");
                        String dateOfArrival = sc.next();
                        LocalDate date = LocalDate.parse(dateOfArrival);
                        System.out.println("Enter Arrival time hh:mm ");
                        String arrivalTime = sc.next();
                        LocalTime time = LocalTime.parse(arrivalTime);
                        System.out.println("Enter Departure time hh:mm");
                        String depTime = sc.next();
                        LocalTime depttime = LocalTime.parse(depTime);
                        System.out.println("Enter from station");
                        String from = sc.next();
                        System.out.println("Enter to station");
                        String to = sc.next();
                        System.out.println("Enter ticket cost");
                        double cost = sc.nextDouble();
                        busServiceImp.addBusDetails(busNumber, date, time, depttime, from, to, cost);
                        break;
                    case 2:
                        System.out.println("Enter Bus Number");
                        int busNum = sc.nextInt();
                        BusDetails busDetails = busServiceImp.printBusDetails(busNum);
                        System.out.println(busDetails);
                        break;
                    case 3:
                        List<Passenger> passengers = new ArrayList<>();
                        System.out.println("Enter Bus Number");
                        int busNumberIn = sc.nextInt();
                        System.out.println("Enter Number of passenger :");
                        int noPassengers = sc.nextInt();
                        for (int i = 0; i < noPassengers; i++) {
                            System.out.println("Enter Passenger Details");

                            System.out.println("Enter passenger name");
                            String name = sc.next();
                            System.out.println("Enter pan number");
                            String pan = sc.next();

                            System.out.println("Enter passport number");
                            String passport = sc.next();

                            System.out.println("Enter phone number");
                            int phone = sc.nextInt();

                            passengers.add(new Passenger(name, pan, passport, phone));
                        }

                        int ticketId = ticketServiceImp.buyTicket(busNumberIn, noPassengers, passengers);
                        System.out.println("Ticket Id = " + ticketId);
                        break;
                    case 4:

                        System.out.println("Enter Ticket Number :");
                        int ticket = sc.nextInt();
                        ;
                        Ticket printTicket = ticketServiceImp.printTicket(ticket);
                        System.out.println("----------Ticket Details-------");
                        System.out.println("From : " + printTicket.getBusDetails().getFrom());
                        System.out.println("To : " + printTicket.getBusDetails().getTo());

                        System.out.println("Departure Date : " + printTicket.getBusDetails().getDateOfArrival());
                        System.out.println("Departure Time : " + printTicket.getBusDetails().getDepartureTime());

                        System.out.println("***********************************************************************************");

                        System.out.println("Passenger Details  : " + printTicket.getPassengers());

                        System.out.println("***********************************************************************************");
                        System.out.println("Total amount : " + printTicket.getTotalAmount());
                        System.out.println("------------------------------------------------------------------------------------");
                        break;
                    case 5:
                        flag = false;
                        break;
                }
            }
        } catch (BusNotFoundExcpetion e) {
            System.out.println(e.getMessage());
        } catch (TicketNotFoundExcpetion e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }

}
