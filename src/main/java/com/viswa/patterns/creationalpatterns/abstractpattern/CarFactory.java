package com.viswa.patterns.creationalpatterns.abstractpattern;

public interface CarFactory {
    CarInterior createInterior();

    CarExterior createEXterior();

    default void produceCompleteVehicle() {
        System.out.println("Starting complete vehicle production...");
        CarExterior exterior = createEXterior();
        CarInterior interior = createInterior();

        exterior.addExteriorComponents();
        interior.addInteriorComponents();
        System.out.println("Vehicle production completed!");
    }
}
