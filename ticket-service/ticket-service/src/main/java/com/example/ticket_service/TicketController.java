package com.example.ticket_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/tickets")
public class TicketController {

    private final RestTemplate restTemplate;

    public TicketController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getTicket")
    public String get() {
        return "Hello from Customer Service";
    }

}
