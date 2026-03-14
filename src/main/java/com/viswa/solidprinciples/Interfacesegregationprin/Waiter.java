package com.viswa.solidprinciples.Interfacesegregationprin;

public class Waiter implements ResturantEmployee {
    @Override
    public void prepareFood() {
        throw new AssertionError("Detail Message: Waiter cannot prepare food!");
    }

    @Override
    public void serverFood() {
        System.out.println("Serving the Food");
    }

    @Override
    public void decideMenu() {
        throw new AssertionError("Detail Message: Waiter cannot decideMenu!");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking Order............");
    }

    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("Detail Message: Waiter cannot cleanTheKitchen!");
    }
}
