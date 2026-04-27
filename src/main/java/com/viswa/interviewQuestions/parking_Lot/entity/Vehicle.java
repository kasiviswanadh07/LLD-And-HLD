package com.viswa.interviewQuestions.parking_Lot.entity;

import com.viswa.interviewQuestions.parking_Lot.enums.VehicleType;

public class Vehicle {
    private final String vehicleNumber;
    private VehicleType vehicleType;


    public Vehicle( String vehicleNumber,VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
