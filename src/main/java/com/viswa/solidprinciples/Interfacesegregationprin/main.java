package com.viswa.solidprinciples.Interfacesegregationprin;

public class main {
    public static void main(String[] args) {

//works fine
        Waiter waiter = new Waiter();
        waiter.serverFood();
        waiter.takeOrder();

        //Implemnting unnecessary method which waiter can't do `
        waiter.cleanTheKitchen();
        waiter.decideMenu();
        waiter.prepareFood();
    }
}
