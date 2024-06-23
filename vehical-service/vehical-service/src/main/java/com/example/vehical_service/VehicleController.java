package com.example.vehical_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {
    private final RestTemplate restTemplate;

    public VehicleController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getVehicle")
    public String get() {
        return "Hello from Vehicle Service";
    }
}
