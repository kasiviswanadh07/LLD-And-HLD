package com.viswa.patterns.structuralpatterns.adapter;

import com.viswa.patterns.structuralpatterns.adapter.Adaptee.ImperialWeighingMachineImpl;
import com.viswa.patterns.structuralpatterns.adapter.Adapter.WeighingMachineAdapter;
import com.viswa.patterns.structuralpatterns.adapter.Adapter.WeightMachineAdapterImpl;

public class MetricWeighingMachine {
    public static void main(String[] args) {
        double weighingScaleReading = 25.0;

        ImperialWeighingMachineImpl imperialWeighingMachine = new ImperialWeighingMachineImpl(weighingScaleReading);
// Adapter to convert to KG
        WeighingMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(imperialWeighingMachine);
// Client gets weight in Kilograms
        System.out.println("Weight in KG: " +
                weightMachineAdapter.getWeightInKg());
    }
}
