package com.viswa.solidprinciples.singleresponsibility;

public class InvoiceDao {
    InvoiceBySingleResponsibilityPrinciple invoice;

    public InvoiceDao(InvoiceBySingleResponsibilityPrinciple invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving to DB......");
    }
}
