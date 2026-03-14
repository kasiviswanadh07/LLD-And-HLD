package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(DrivingStrategy driveStrategy) {
        super(driveStrategy);
    }
}
