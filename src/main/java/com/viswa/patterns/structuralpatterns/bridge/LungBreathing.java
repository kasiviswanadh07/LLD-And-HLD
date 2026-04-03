package com.viswa.patterns.structuralpatterns.bridge;

public class LungBreathing implements BreathingProcess{
    @Override
    public void breath() {
        System.out.println("Breathing through Lungs");
    }
}
