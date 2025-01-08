package com.herokuapp.amg_cloud_parking.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Parking {
    
    @Id
    private String id;
    private String license;
    private String state;
    private String model;
    private String color;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Double bill;
   

    public Parking(String id, String license, String state, String model, String color, LocalDateTime checkIn) {
        this.id = id;
        this.license = license;
        this.state = state;
        this.model = model;
        this.color = color;
        this.checkIn = checkIn;

    }

    public Parking() {

    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public LocalDateTime getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }
    public LocalDateTime getCheckOut() {
        return checkOut;
    }
    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }
    public Double getBill() {
        return bill;
    }
    public void setBill(Double bill) {
        this.bill = bill;
    }

}


