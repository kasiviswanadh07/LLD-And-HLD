package com.viswa.patterns.structuralpatterns.adapter.Adaptee;

public class ImperialWeighingMachineImpl implements ImperialWeighingMachine {


    double weighingScaleReadingInPound = 0;

    public ImperialWeighingMachineImpl(double weighingScaleReadingInPound) {
        this.weighingScaleReadingInPound = weighingScaleReadingInPound;
    }

    @Override
    public double getWeightInPounds() {

        return weighingScaleReadingInPound;
    }
}