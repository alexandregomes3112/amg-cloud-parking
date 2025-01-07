package com.herokuapp.amg_cloud_parking.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.herokuapp.amg_cloud_parking.exception.ParkingNotFoundException;
import com.herokuapp.amg_cloud_parking.model.Parking;

@Service
public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap<>();

    
    public List<Parking> findAll() {
        return parkingMap.values().stream().collect(Collectors.toList());
    }
    
    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public Parking findById(String id) {
        Parking parking = parkingMap.get(id);
        if (parking == null) {
            throw new ParkingNotFoundException(id);
        }
        return parking;

    }

    public Parking create(Parking parkingCreate) {
        String uuid = getUUID();
        parkingCreate.setId(uuid);
        parkingCreate.setCheckIn(LocalDateTime.now());
        parkingMap.put(uuid, parkingCreate);
        return parkingCreate;
    }

    public void delete(String id) {
        findById(id);
        parkingMap.remove(id);
    }

    public Parking update(String id, Parking parkingCreate){
        Parking parking = findById(id);
        parking.setColor(parkingCreate.getColor());
        parkingMap.replace(id, parking);
        return parking;
    }

    public Parking exit(String id) {
        Parking parking = findById(id);
        LocalDateTime checkOutTime = LocalDateTime.now();
        parking.setCheckOut(checkOutTime);
        
        // Calculate the duration between check-in and check-out
        Duration duration = Duration.between(parking.getCheckIn(), checkOutTime);
        long seconds = duration.getSeconds();
        
         // Charge 0.01 per second
         double bill = seconds * 0.01;
         parking.setBill(bill);
 
         parkingMap.replace(id, parking);
         return parking;
    }

}
