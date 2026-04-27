package com.viswa.interviewQuestions.parking_Lot;

import com.viswa.interviewQuestions.parking_Lot.LookupStrategy.ParkingSpotLookupStrategy;
import com.viswa.interviewQuestions.parking_Lot.LookupStrategy.RandomSpotLookupStrategy;
import com.viswa.interviewQuestions.parking_Lot.Payment.CashPayment;
import com.viswa.interviewQuestions.parking_Lot.Payment.UPiPayment;
import com.viswa.interviewQuestions.parking_Lot.Pricing.CostComputation;
import com.viswa.interviewQuestions.parking_Lot.Pricing.FixedPricingStrategy;
import com.viswa.interviewQuestions.parking_Lot.entity.ParkingSpot;
import com.viswa.interviewQuestions.parking_Lot.entity.Vehicle;
import com.viswa.interviewQuestions.parking_Lot.enums.VehicleType;
import com.viswa.interviewQuestions.parking_Lot.gates.Ticket;
import com.viswa.interviewQuestions.parking_Lot.parkingLot.*;
import com.viswa.interviewQuestions.parking_Lot.spotManagers.FourWheelerSpotManager;
import com.viswa.interviewQuestions.parking_Lot.spotManagers.ParkingSpotManager;
import com.viswa.interviewQuestions.parking_Lot.spotManagers.TwoWheelerSpotManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {
    public static void main(String[] args) {

        ParkingSpotLookupStrategy strategy = new RandomSpotLookupStrategy();

        Map<VehicleType, ParkingSpotManager> levelOneManagers = new HashMap<>();
        levelOneManagers.put(VehicleType.Two_Wheeler,
                new TwoWheelerSpotManager(List.of(new ParkingSpot("L1-S1"),
                        new ParkingSpot("L1-S2")), strategy));

        levelOneManagers.put(VehicleType.Four_Wheeler,
                new FourWheelerSpotManager(List.of(new ParkingSpot("L1-S3")), strategy));

        ParkingLevel level1 = new ParkingLevel(
                1, levelOneManagers
        );

        Map<VehicleType, ParkingSpotManager> levelTwoManagers = new HashMap<>();
        levelTwoManagers.put(VehicleType.Two_Wheeler,
                new TwoWheelerSpotManager(List.of(new ParkingSpot("L2-S1")), strategy));

        levelTwoManagers.put(VehicleType.Four_Wheeler,
                new FourWheelerSpotManager(List.of(new ParkingSpot("L2-S2"),
                        new ParkingSpot("L2-S3")), strategy));


        ParkingLevel level2 = new ParkingLevel(
                2, levelTwoManagers
        );

        ParkingBuilding parkingBuilding =
                new ParkingBuilding(
                        List.of(level1, level2),
                        new CostComputation(new FixedPricingStrategy())
                );

        ParkingLot parkingLot = new ParkingLot(
                parkingBuilding,
                new EntranceGate(),
                new ExitGate(new CostComputation(new FixedPricingStrategy()))
        );


        Vehicle bike = new Vehicle("BIKE-101", VehicleType.Two_Wheeler);
        Vehicle car = new Vehicle("CAR-201", VehicleType.Four_Wheeler);

        Ticket t1 = parkingLot.vehicleArrives(bike);
        Ticket t2 = parkingLot.vehicleArrives(car);

        parkingLot.vehicleExits(t1, new CashPayment());
        parkingLot.vehicleExits(t2, new UPiPayment());
    }

}

