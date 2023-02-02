package org.example.exception;

public class TicketNotFoundExcpetion extends RuntimeException{
    public TicketNotFoundExcpetion(String message) {
        super(message);
    }
}
