package com.viswa.patterns.structuralpatterns.decorator;

public class FarmPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "FarmPizza";
    }

    @Override
    public double getCost() {
        return 170;
    }
}
