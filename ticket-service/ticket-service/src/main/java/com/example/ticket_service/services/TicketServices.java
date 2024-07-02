package com.example.ticket_service.services;

import com.example.ticket_service.dto.TicketDTO;


public interface TicketServices {
    String ticketCreate(TicketDTO ticketDTO);
    String updateTicket(String updateTicketId ,TicketDTO ticketDTO);
    String getTicketDetails(String ticketId);
    boolean alreadyTicketHaveCheck(String ticketId);
    void ticketStatusUpdate(String ticketId);
}
