    package com.viswa.solidprinciples.Liskovsubstitutionprincipls;

public class Bicycle implements BikeWithoutLiskovPrinciple {
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

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Detail Message: Bicycle has no engine !");
    }

    @Override
    public void turnOffEngine() {
        throw new AssertionError("Detail Message: Bicycle has no engine !");
    }

}
