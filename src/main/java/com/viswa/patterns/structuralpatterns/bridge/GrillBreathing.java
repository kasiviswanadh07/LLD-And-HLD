package com.viswa.patterns.structuralpatterns.bridge;

public class GrillBreathing implements BreathingProcess {
    @Override
    public void breath() {
        System.out.println("Breathing through gills.");
    }
}
