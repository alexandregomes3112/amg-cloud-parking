package com.herokuapp.amg_cloud_parking.service;

import java.time.Duration;
import java.time.LocalDateTime;

import com.herokuapp.amg_cloud_parking.model.Parking;

public class ParkingCheckout {

    public static final int ONE_HOUR = 60;
    public static final int TWENTY_FOUR_HOUE = 24 * ONE_HOUR;
    public static final double ONE_HOUR_VALUE = 5.0;
    public static final double ADDITIONAL_PER_HOUR_VALUE = 2.0;
    public static final double DAY_VALUE = 50.0;

    public static Double getBill(Parking parking){
        return getBill(parking.getCheckIn(), parking.getCheckOut());
    }

    private static Double getBill(LocalDateTime checkIn, LocalDateTime checkOut) {
        long hours = Duration.between(checkIn, checkOut).toHours();
        if(hours <= ONE_HOUR){
            return ONE_HOUR_VALUE;
        }
        if(hours <= TWENTY_FOUR_HOUE){
            return DAY_VALUE;
        }
        return DAY_VALUE + (hours - TWENTY_FOUR_HOUE) * ADDITIONAL_PER_HOUR_VALUE;
    }

}
