package com.viswa.strategypattern.withoutstrategypattern;

public class SportsVehicle extends Vehicle {
    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ":");
        System.out.println("Driving Capability: Sports");
    }
}
