package com.herokuapp.amg_cloud_parking.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herokuapp.amg_cloud_parking.controller.dto.ParkingMapper;
import com.herokuapp.amg_cloud_parking.controller.mapper.ParkingDTO;
import com.herokuapp.amg_cloud_parking.model.Parking;
import com.herokuapp.amg_cloud_parking.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping
    public List<Parking> findAll() {
        return parkingService.findAll();
    }

}
