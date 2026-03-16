package com.viswa.patterns.creationalpatterns.abstractpattern;

public class CarProvider {
    public CarFactory getFactory(CarType type, String brand) {
        switch (type) {
            case LUXURY:
                return new LuxuryCarFactory(brand);
            case ECONOMY:
            case PREMIUM:
                return new EconomyCarFactory(brand);
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }

    }

}


