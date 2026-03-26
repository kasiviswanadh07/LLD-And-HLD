package com.viswa.patterns.nullobjectpattern;

public class Bike implements Vehicle {
    private String model;
    private String color;
    private int seatingCapacity;
    private int fuelTankCapacity;
    private boolean isAvailableForTestDrive;

    public Bike(String model, String color, int seatingCapacity, int fuelTankCapacity, boolean isAvailableForTestDrive) {
        this.model = model;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.fuelTankCapacity = fuelTankCapacity;
        this.isAvailableForTestDrive = isAvailableForTestDrive;
    }

    public boolean isAvailableForTestDrive() {
        return isAvailableForTestDrive;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stoped");
    }
}
