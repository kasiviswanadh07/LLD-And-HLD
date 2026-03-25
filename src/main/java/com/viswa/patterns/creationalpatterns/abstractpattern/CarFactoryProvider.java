package com.viswa.patterns.creationalpatterns.abstractpattern;

public class CarFactoryProvider {
    public CarFactory getFactory(CarType type, String brand) {
        switch (type) {
            case LUXURY:
            case PREMIUM:
                return new LuxuryCarFactory(brand);
            case ECONOMY:
                return new EconomyCarFactory(brand);
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }

    }

}


