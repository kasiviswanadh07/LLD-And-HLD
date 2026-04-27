package com.viswa.interviewQuestions.parking_Lot.parkingLot;

import com.viswa.interviewQuestions.parking_Lot.Payment.Payment;
import com.viswa.interviewQuestions.parking_Lot.entity.Vehicle;
import com.viswa.interviewQuestions.parking_Lot.gates.Ticket;

import java.security.PrivateKey;

public class ParkingLot {
    private final  ParkingBuilding building;
    private final EntranceGate entranceGate;
    private final ExitGate exitGate;

    public ParkingLot(ParkingBuilding building, EntranceGate entranceGate, ExitGate exitGate) {
        this.building = building;
        this.entranceGate = entranceGate;
        this.exitGate = exitGate;
    }
    public Ticket vehicleArrives(Vehicle vehicle) {
        return entranceGate.enter(building, vehicle);
    }

    public void vehicleExits(Ticket ticket, Payment payment) {
        exitGate.completeExit(building, ticket, payment);
    }

}
