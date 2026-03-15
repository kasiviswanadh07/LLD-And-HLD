package com.viswa.patterns.structuralpatterns.decorator;

public class PepperniTopping extends ToppingDecorator {

    public PepperniTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " with pepperniTopping";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 50;
    }
}
