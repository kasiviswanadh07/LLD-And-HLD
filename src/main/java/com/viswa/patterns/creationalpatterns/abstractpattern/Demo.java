package com.viswa.patterns.creationalpatterns.abstractpattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("=====Abstract Factory Design Pattern=====");

        CarFactoryProvider carFactoryProvider=new CarFactoryProvider();

        CarFactory luxuryCarFactory=carFactoryProvider.getFactory(CarType.PREMIUM,"BMW");
        luxuryCarFactory.produceCompleteVehicle();

        CarFactory EconomyCarFactory=carFactoryProvider.getFactory(CarType.ECONOMY,"Volswagen");
        EconomyCarFactory.produceCompleteVehicle();
    }

}
