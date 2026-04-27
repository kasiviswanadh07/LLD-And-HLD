package com.viswa.interviewQuestions.parking_Lot.parkingLot;

import com.viswa.interviewQuestions.parking_Lot.entity.Vehicle;
import com.viswa.interviewQuestions.parking_Lot.gates.Ticket;

public class EntranceGate {
    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}
