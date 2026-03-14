package com.viswa.solidprinciples.Interfacesegregationprin.solution;

public class Waiter implements WaiterTasks {
    @Override
    public void serveFood() {
        System.out.println("Serving Food to the people in the resturant");
    }

    @Override
    public void TakerOrder() {
        System.out.println("TakerOrder Order from the customers");
    }
}
