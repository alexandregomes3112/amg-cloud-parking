package com.herokuapp.amg_cloud_parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.herokuapp.amg_cloud_parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {

}
