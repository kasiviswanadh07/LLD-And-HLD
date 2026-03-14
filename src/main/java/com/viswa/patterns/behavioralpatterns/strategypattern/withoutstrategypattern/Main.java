package com.viswa.patterns.behavioralpatterns.strategypattern.withoutstrategypattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.drive();
        vehicle = new SportsVehicle();
        vehicle.drive();

        vehicle=new OffRoadVehicle();
        vehicle.drive();
    }
}
