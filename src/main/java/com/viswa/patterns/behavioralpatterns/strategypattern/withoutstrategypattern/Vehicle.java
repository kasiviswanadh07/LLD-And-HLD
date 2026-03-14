package com.viswa.patterns.behavioralpatterns.strategypattern.withoutstrategypattern;

public class Vehicle {
    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ":");
        System.out.println("Driving Capability: Normal");
    }
}
