package com.viswa.strategypattern.withstrategypattern;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DrivingStrategy driveStrategy) {
        super(driveStrategy);
    }
}
