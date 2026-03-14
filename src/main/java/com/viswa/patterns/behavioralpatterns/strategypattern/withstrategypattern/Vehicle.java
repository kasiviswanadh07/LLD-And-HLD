package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class Vehicle {

    DrivingStrategy drivingStrategy;

    // constructor injection
    public Vehicle(DrivingStrategy driveStrategy) {
        this.drivingStrategy = driveStrategy;
    }

    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ":");
        drivingStrategy.drive();
    }
}
