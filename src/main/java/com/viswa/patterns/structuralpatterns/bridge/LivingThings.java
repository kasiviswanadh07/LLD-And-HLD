package com.viswa.patterns.structuralpatterns.bridge;

public abstract class LivingThings {
    BreathingProcess breathingProcess;

    public LivingThings(BreathingProcess breathingProcess) {
        this.breathingProcess = breathingProcess;
    }

    abstract public void breath();
}
