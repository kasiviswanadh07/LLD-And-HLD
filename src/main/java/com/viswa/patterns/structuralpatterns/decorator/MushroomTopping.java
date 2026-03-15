package com.viswa.patterns.structuralpatterns.decorator;

public class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " With Mushroom Topping";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 80;
    }
}
