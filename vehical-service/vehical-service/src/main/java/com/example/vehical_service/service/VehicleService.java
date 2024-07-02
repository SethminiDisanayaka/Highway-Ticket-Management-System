package com.example.vehical_service.service;

import com.example.vehical_service.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    void registerVehicle(VehicleDTO vehicleDTO);
    void updateVehicle(String updateVehicleId , VehicleDTO vehicleDTO);
    void deleteVehicle(String deleteVehicleId);
    List<VehicleDTO> getAllVehicles();
}
