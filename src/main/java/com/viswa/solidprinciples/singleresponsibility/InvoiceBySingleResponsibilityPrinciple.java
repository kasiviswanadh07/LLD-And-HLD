package com.viswa.solidprinciples.singleresponsibility;

import com.viswa.solidprinciples.Marker;

public class InvoiceBySingleResponsibilityPrinciple {
    private Marker marker;
    private int quantity;
    private int total;


    public InvoiceBySingleResponsibilityPrinciple(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;

    }

    // Responsibility 1: Calculate the total(business logic)
    public void calculateTotal() {
        System.out.println("Calculating total...");
        this.total = this.marker.price * this.quantity;

    }
}
