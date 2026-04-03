package com.viswa.patterns.structuralpatterns.bridge;

public class Fish extends LivingThings{
    public Fish(BreathingProcess breathingProcess) {
        super(breathingProcess);
    }

    @Override
    public void breath() {
        System.out.print("Fish: ");
        breathingProcess.breath();
    }
}
