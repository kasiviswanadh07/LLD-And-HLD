package com.viswa.strategypattern.withstrategypattern;

public class NormalDrive implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Normal");
    }
}
