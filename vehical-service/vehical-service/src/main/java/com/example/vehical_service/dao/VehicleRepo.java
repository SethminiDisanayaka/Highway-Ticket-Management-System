package com.example.vehical_service.dao;

import com.example.vehical_service.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<VehicleEntity , String> {
}
