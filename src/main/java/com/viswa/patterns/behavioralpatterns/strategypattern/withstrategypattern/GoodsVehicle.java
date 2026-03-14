package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(DrivingStrategy driveStrategy) {
        super(driveStrategy);
    }
}
