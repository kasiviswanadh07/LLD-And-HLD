package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class EVMode implements DriveModeStrategy{
    @Override
    public void mode() {
        System.out.println("Driving Mode is EV");
    }
}
