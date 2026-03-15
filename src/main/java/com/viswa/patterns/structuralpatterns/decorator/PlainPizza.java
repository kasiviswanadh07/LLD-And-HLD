package com.viswa.patterns.structuralpatterns.decorator;

public class PlainPizza implements BasePizza {

    @Override
    public String getDescription() {
        return "Plain Pizzaa";
    }
    @Override
    public double getCost() {
        return 150;
    }
}
