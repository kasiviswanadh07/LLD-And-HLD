package com.viswa.strategypattern.withoutstrategypattern;

public class OffRoadVehicle extends Vehicle {
    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ":");
        System.out.println("Driving Capability: Sports");
    }
    /*It need sports behaviour we are overriding the drive method from parent class but the parent class does not
    have the feature of the sprots */
}
