package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DrivingStrategy driveStrategy) {
        super(driveStrategy);
    }
}
