package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class SportDrive implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports");
    }
}
