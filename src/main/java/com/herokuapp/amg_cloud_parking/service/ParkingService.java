package com.herokuapp.amg_cloud_parking.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

import com.herokuapp.amg_cloud_parking.exception.ParkingNotFoundException;
import com.herokuapp.amg_cloud_parking.model.Parking;
import com.herokuapp.amg_cloud_parking.repository.ParkingRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingService {

    private final ParkingRepository parkingRepository;

    public ParkingService(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }
    
    @Transactional
    public List<Parking> findAll() {
        return parkingRepository.findAll();
    }
    
    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    @Transactional
    public Parking findById(String id) {
        return parkingRepository
            .findById(id)
            .orElseThrow(() -> 
            new ParkingNotFoundException(id));
    }

    @Transactional
    public Parking create(Parking parkingCreate) {
        String uuid = getUUID();
        parkingCreate.setId(uuid);
        parkingCreate.setCheckIn(LocalDateTime.now());
        parkingRepository.save(parkingCreate);
        return parkingCreate;
    }

    @Transactional
    public void delete(String id) {
        findById(id);
        parkingRepository.deleteById(id);
    }

    @Transactional
    public Parking update(String id, Parking parkingCreate){
        Parking parking = findById(id);
        parking.setColor(parkingCreate.getColor());
        parking.setModel(parkingCreate.getModel());
        parking.setState(parkingCreate.getState());
        parking.setLicense(parkingCreate.getLicense());
        parkingRepository.save(parking);
        return parking;
    }

    @Transactional
    public Parking exit(String id) {
        Parking parking = findById(id);
        parking.setCheckOut(LocalDateTime.now());
        parking.setBill(ParkingCheckout.getBill(parking));
        parkingRepository.save(parking);
         return parking;
    }

}
