package com.viswa.patterns.structuralpatterns.bridge;

public class Tree extends LivingThings{
    public Tree(BreathingProcess breathingProcess) {
        super(breathingProcess);
    }

    @Override
    public void breath() {
        System.out.print("Dog: ");
        breathingProcess.breath();
    }
}
