package com.example.vehical_service.dto;

import com.example.vehical_service.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO implements SuperDTO{
    private String vehicleId;
    private String vehicleNumber;
    private String vehicleType;
    private UserEntity users;
}
