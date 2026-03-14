package com.viswa.strategypattern.withstrategypattern;

public class HybridMode extends DriveMode {
    public HybridMode(DriveModeStrategy drivingModeStrategy) {
        super(drivingModeStrategy);
    }
}
