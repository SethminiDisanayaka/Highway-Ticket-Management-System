package com.example.vehical_service.controller;

import com.example.vehical_service.dto.VehicleDTO;
import com.example.vehical_service.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping
    @RequestMapping("/registerVehicle")
    public void registerVehicle(@RequestBody VehicleDTO vehicleDTO){
        vehicleService.registerVehicle(vehicleDTO);
    }

    @PutMapping
    @RequestMapping("/update/{updateVehicleId}")
    public void updateVehicle(@PathVariable("updateVehicleId") String updateVehicleID ,@RequestBody VehicleDTO vehicleDTO){
        vehicleService.updateVehicle(updateVehicleID ,vehicleDTO);
    }

    @DeleteMapping
    @RequestMapping("/delete/{deleteVehicleId}")
    public void deleteVehicle(@PathVariable("/deleteVehicleId") String deleteVehicleId){
        vehicleService.deleteVehicle(deleteVehicleId);
    }

    @GetMapping
    @RequestMapping("/getAllVehicles")
    public List<VehicleDTO> getAllVehicles(){
        List<VehicleDTO> allVehicles = vehicleService.getAllVehicles();
        return allVehicles;
    }
}
