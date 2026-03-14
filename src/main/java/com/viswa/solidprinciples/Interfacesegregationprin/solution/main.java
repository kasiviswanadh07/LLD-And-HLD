package com.viswa.solidprinciples.Interfacesegregationprin.solution;

public class main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        chef.decideMenu();
        chef.prepareFood();
        waiter.serveFood();
        waiter.TakerOrder();
    }
}
