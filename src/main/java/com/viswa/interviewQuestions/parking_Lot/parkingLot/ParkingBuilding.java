package com.viswa.interviewQuestions.parking_Lot.parkingLot;

import com.viswa.interviewQuestions.parking_Lot.Pricing.CostComputation;
import com.viswa.interviewQuestions.parking_Lot.entity.ParkingSpot;
import com.viswa.interviewQuestions.parking_Lot.entity.Vehicle;
import com.viswa.interviewQuestions.parking_Lot.gates.Ticket;

import java.util.List;

public class ParkingBuilding {
    private final List<ParkingLevel> levels;

    public ParkingBuilding(List<ParkingLevel> levels, CostComputation costComputation) {
        this.levels = levels;
    }

    public Ticket allocate(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            if (level.hasAvailability(vehicle.getVehicleType())) {
                ParkingSpot spot = level.park(vehicle.getVehicleType());
                if (spot != null) {
                    Ticket ticket = new Ticket(vehicle, level, spot);
                    System.out.println("Parking allocated at level: "
                            + level.getLevelNumber()
                            + " spot: " + spot.getSpotId());
                    return ticket;
                }
            }
        }
        throw new RuntimeException("Parking Full");
    }

    void release(Ticket ticket) {
        ticket.getLevel().unPark(
                ticket.getVehicle().getVehicleType(),
                ticket.getSpot()
        );
    }


}
