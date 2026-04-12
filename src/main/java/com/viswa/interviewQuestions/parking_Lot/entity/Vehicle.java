package com.viswa.interviewQuestions.parking_Lot.entity;

import com.viswa.interviewQuestions.parking_Lot.enums.VehicleType;

public class Vehicle {
    private final String vehicleNumber;
    private VehicleType vehicleType;
//    private Ticket ticket;


    public Vehicle(VehicleType vehicleType, String vehicleNumber) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

//    public void assignTicket() {
//        this.ticket = ticket;
//    }
}
