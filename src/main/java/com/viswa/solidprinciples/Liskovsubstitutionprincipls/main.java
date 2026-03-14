package com.viswa.solidprinciples.Liskovsubstitutionprincipls;

public class main {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle(50, "Honda");
        Bicycle bicycle = new Bicycle(true, "Herculus", 80);
        motorCycle.turnOnEngine();
        motorCycle.turnOffEngine();
        motorCycle.applyBrakes();
        motorCycle.accelerate();

        bicycle.turnOffEngine();
        bicycle.applyBrakes();
        bicycle.turnOffEngine();
        bicycle.accelerate();
    }
}
