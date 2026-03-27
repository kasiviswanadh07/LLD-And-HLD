package com.viswa.patterns.structuralpatterns.adapter.Adapter;

import com.viswa.patterns.structuralpatterns.adapter.Adaptee.ImperialWeighingMachine;

public class WeightMachineAdapterImpl implements WeighingMachineAdapter {
    ImperialWeighingMachine imperialWeighingMachine;

    public WeightMachineAdapterImpl(ImperialWeighingMachine imperialWeighingMachine) {
        this.imperialWeighingMachine = imperialWeighingMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = imperialWeighingMachine.getWeightInPounds();
        return weightInPound * 0.45;
    }
}
