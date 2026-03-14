package com.viswa.solidprinciples.openclosedPrinciple;

import com.viswa.solidprinciples.Invoice;

public class FileInvoiceDao implements InvoiceDao {
    Invoice invoice;

    public FileInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving in to file from fileinvoicedao");
    }
}
