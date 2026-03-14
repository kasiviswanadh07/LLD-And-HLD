package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class DriveMode {
    DriveModeStrategy drivingModeStrategy;

    // constructor injection
    public DriveMode(DriveModeStrategy drivingModeStrategy) {
        this.drivingModeStrategy = drivingModeStrategy;
    }

    public void Mode() {
        System.out.println("\n" + this.getClass().getSimpleName() + ":");
        drivingModeStrategy.mode();
    }
}
