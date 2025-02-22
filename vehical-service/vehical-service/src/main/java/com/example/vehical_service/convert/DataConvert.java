package com.example.vehical_service.convert;

import com.example.vehical_service.dto.VehicleDTO;
import com.example.vehical_service.entity.VehicleEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataConvert {
    private final ModelMapper modelMapper;

    public VehicleDTO vehicleEntityConvertVehicleDTO(VehicleEntity vehicleEntity){
        return modelMapper.map(vehicleEntity, VehicleDTO.class);
    }

    public VehicleEntity vehicleDTOConvertVehicleEntity(VehicleDTO vehicleDTO){
        return modelMapper.map(vehicleDTO, VehicleEntity.class);
    }

    public List<VehicleDTO> vehicleEntityListConvertVehicleDTOList(List<VehicleEntity> vehicleEntityList){
        return modelMapper.map(vehicleEntityList, List.class);
    }

}
