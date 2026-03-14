package com.viswa.patterns.behavioralpatterns.strategypattern.withstrategypattern;

public class PetrolMode implements DriveModeStrategy{
    @Override
    public void mode() {
        System.out.println("Driving Mode is Petrol");
    }
}
