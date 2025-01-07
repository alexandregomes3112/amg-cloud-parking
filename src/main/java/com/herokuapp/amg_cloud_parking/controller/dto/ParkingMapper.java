package com.herokuapp.amg_cloud_parking.controller.dto;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.herokuapp.amg_cloud_parking.controller.mapper.ParkingDTO;
import com.herokuapp.amg_cloud_parking.model.Parking;

@Component
public class ParkingMapper {
    
    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ParkingDTO parkingDTO(Parking parking) {
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }

    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        return null;
    }

}
