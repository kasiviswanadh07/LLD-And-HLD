package com.viswa.solidprinciples.singleresponsibility;

public class InvoicePrinter {
    private InvoiceBySingleResponsibilityPrinciple invoice;

    public InvoicePrinter(InvoiceBySingleResponsibilityPrinciple invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println("Printing Invoice");
    }
}
