package com.viswa.solidprinciples;

public class Invoice {
    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotal() {
        System.out.println("Calcualting the total");
        this.total = this.marker.price * this.quantity;
    }

    public void saveToDB() {
        System.out.println("Saving to the DB");
    }

    public void printingInvoice() {
        System.out.println("Printing Invoice...");
    }
}
