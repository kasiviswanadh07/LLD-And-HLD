package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class EvDrive implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Electric Vehicle");
    }
}
