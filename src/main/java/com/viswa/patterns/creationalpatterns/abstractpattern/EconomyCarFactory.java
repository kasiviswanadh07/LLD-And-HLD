package com.viswa.patterns.creationalpatterns.abstractpattern;

public class EconomyCarFactory implements CarFactory {
    private final String brand;

    public EconomyCarFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public CarInterior createInterior() {
        return new EconomyInterior();
    }

    @Override
    public CarExterior createEXterior() {
        return new EconomyCarExterior() {
        };
    }
}
