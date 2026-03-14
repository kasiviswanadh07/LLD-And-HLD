package com.viswa.solidprinciples.Liskovsubstitutionprincipls.Solution;

public class main {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle(50, "Honda");
        Bicycle bicycle = new Bicycle(true, "Herculus", 80);
        motorCycle.accelerate();
        motorCycle.accelerate();
        motorCycle.turnOffEngine();
        motorCycle.turnOnEngine();

        bicycle.applyBrakes();
        bicycle.applyBrakes();


    }
}
