package com.viswa.interviewQuestions.parking_Lot.LookupStrategy;

import com.viswa.interviewQuestions.parking_Lot.entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {

    public ParkingSpot selectSpot(List<ParkingSpot> spots);
}
