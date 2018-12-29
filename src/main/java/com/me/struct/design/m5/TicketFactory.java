package com.me.struct.design.m5;

import java.util.HashMap;
import java.util.Map;

public final class TicketFactory {
    
    private static final Map<String, Ticket> tickets = new HashMap<>();
    private TicketFactory() {
        
    }
    
    public static synchronized Ticket geTicket(String start,String end) {
        String key = start+"-"+end;
        Ticket ticket = tickets.get(key);
        
        if(ticket == null) {
            ticket = new ConcreteTicket(start, end);
            tickets.put(key, ticket);
        }
        
        return ticket;
    }
}
