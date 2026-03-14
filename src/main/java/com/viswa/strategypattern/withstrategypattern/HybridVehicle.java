package com.viswa.strategypattern.withstrategypattern;

public class HybridVehicle extends Vehicle{
    public HybridVehicle(DrivingStrategy driveStrategy) {
        super(driveStrategy);
    }
}
