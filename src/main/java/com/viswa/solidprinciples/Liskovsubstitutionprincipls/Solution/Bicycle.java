package com.viswa.solidprinciples.Liskovsubstitutionprincipls.Solution;

public class Bicycle extends Bike {
    int speed;
    String brand;
    boolean hasGears;

    public Bicycle(boolean hasGears, String brand, int speed) {
        this.hasGears = hasGears;
        this.brand = brand;
        this.speed = speed;
    }


    @Override
    public void accelerate() {
        this.speed = this.speed + 10; // increase the speed
        System.out.println("MotorCycle Speed: " + this.speed);
    }


    @Override
    public void applyBrakes() {
        this.speed = this.speed - 5; // decrease the speed
        System.out.println("MotorCycle Speed: " + this.speed);
    }



}
