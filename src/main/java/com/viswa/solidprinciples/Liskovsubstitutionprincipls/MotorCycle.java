package com.viswa.solidprinciples.Liskovsubstitutionprincipls;

public class MotorCycle implements BikeWithoutLiskovPrinciple {
    String company;
    boolean isEngineOn;
    int speed;

    public MotorCycle(int speed, String company) {
        this.speed = speed;
        this.company = company;
    }

        @Override
        public void turnOnEngine() {
            this.isEngineOn = true;
            System.out.println("Engine On");
        }

        @Override
        public void turnOffEngine() {
            this.isEngineOn = false; // turn off the engine!
            System.out.println("Engine is OFF!");
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
