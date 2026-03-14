package com.viswa.strategypattern.withstrategypattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle(new SportDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();

        vehicle = new HybridVehicle(new EvDrive());
        vehicle.drive();

        DriveMode driveMode = new HybridMode(new EVMode());
        driveMode.Mode();
        driveMode = new HybridMode(new PetrolMode());
        driveMode.Mode();
    }
}
