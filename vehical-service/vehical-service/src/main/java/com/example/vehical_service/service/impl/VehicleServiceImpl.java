package com.example.vehical_service.service.impl;

import com.example.vehical_service.convert.DataConvert;
import com.example.vehical_service.dao.VehicleRepo;
import com.example.vehical_service.dto.VehicleDTO;
import com.example.vehical_service.entity.VehicleEntity;
import com.example.vehical_service.service.VehicleService;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepo vehicleRepo;

    @Autowired
    DataConvert dataConvert;

    Logger logger = LoggerFactory.getLogger(VehicleServiceImpl.class);

    @Override
    public void registerVehicle(@RequestBody VehicleDTO vehicleDTO) {
        if (vehicleRepo.existsById(vehicleDTO.getVehicleId())){
            logger.info("This Id Have Already register Vehicle");
        }else{
            vehicleRepo.save(dataConvert.vehicleDTOConvertVehicleEntity(vehicleDTO));
            logger.info("Vehicle Register Done");
        }
    }

    @Override
    public void updateVehicle(String updateVehicleId, VehicleDTO vehicleDTO) {

        if (vehicleRepo.existsById(updateVehicleId)){
            VehicleEntity updateVehicleEntity = vehicleRepo.findById(updateVehicleId).orElse(null);
            updateVehicleEntity.setVehicleNumber(vehicleDTO.getVehicleNumber());
            updateVehicleEntity.setVehicleType(vehicleDTO.getVehicleType());
            updateVehicleEntity.setUsers(vehicleDTO.getUsers());

            vehicleRepo.save(updateVehicleEntity);
        }else{
            logger.info("This Id Have No Vehicles");
        }
    }

    @Override
    public void deleteVehicle(String deleteVehicleId) {
        if (vehicleRepo.existsById(deleteVehicleId)){
            vehicleRepo.deleteById(deleteVehicleId);
        }else{
            logger.info("This Id Have No Vehicle");
        }
    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        List<VehicleEntity> allVehicles = vehicleRepo.findAll();
        return dataConvert.vehicleEntityListConvertVehicleDTOList(allVehicles);
    }
}
