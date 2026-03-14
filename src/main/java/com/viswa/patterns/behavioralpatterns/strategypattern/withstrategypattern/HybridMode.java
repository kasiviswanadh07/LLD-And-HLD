package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class HybridMode extends DriveMode {
    public HybridMode(DriveModeStrategy drivingModeStrategy) {
        super(drivingModeStrategy);
    }
}
