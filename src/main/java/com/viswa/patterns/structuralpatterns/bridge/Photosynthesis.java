package com.viswa.patterns.structuralpatterns.bridge;

public class Photosynthesis implements BreathingProcess {
    @Override
    public void breath() {
        System.out.println("Breathing through Leaves");
    }
}
