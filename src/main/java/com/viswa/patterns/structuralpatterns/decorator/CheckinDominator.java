package com.viswa.patterns.structuralpatterns.decorator;

public class CheckinDominator implements BasePizza{
    @Override
    public String getDescription() {
        return "CheckinDominator";
    }

    @Override
    public double getCost() {
        return 230;
    }
}
