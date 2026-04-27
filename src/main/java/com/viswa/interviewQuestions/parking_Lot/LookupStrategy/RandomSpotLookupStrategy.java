package com.viswa.interviewQuestions.parking_Lot.LookupStrategy;

import com.viswa.interviewQuestions.parking_Lot.entity.ParkingSpot;

import java.util.List;

public class RandomSpotLookupStrategy implements ParkingSpotLookupStrategy {
    @Override
    public ParkingSpot selectSpot(List<ParkingSpot> spots) {
        for (ParkingSpot spot : spots) {
            if (spot.isSpotFree()) {
                return spot;
            }
        }
        return null;
    }
}
