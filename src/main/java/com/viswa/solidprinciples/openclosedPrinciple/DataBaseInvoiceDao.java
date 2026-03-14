package com.viswa.solidprinciples.openclosedPrinciple;

import com.viswa.solidprinciples.Invoice;

public class DataBaseInvoiceDao implements InvoiceDao {
    Invoice invoice;

    public DataBaseInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving to DB from DatabaseInvoiceDao");
    }
}
