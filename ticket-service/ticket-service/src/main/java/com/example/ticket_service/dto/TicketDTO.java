package com.example.ticket_service.dto;

import com.example.ticket_service.entity.VehicleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO implements SuperDTO {
    private String ticketId;
    private String entranceLocation;
    private String exitLocation;
    private String status;
    private String ticketIssueTime;
    private Double oneKmPrice;
    private int totalKm;
    private Double price;
    private VehicleEntity vehicle;
}
