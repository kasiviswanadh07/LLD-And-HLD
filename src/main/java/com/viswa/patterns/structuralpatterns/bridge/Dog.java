package com.viswa.patterns.structuralpatterns.bridge;

public class Dog extends LivingThings {
    public Dog(BreathingProcess breathingProcess) {
        super(breathingProcess);
    }

    @Override
    public void breath() {
        System.out.print("Dog: ");
        breathingProcess.breath();
    }
}
