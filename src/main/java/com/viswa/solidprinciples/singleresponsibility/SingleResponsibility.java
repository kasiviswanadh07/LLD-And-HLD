package com.viswa.solidprinciples.singleresponsibility;

import com.viswa.solidprinciples.*;

public class SingleResponsibility {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("TextMarker", "white", 20, 6), 3);
        invoice.calculateTotal();
        invoice.saveToDB();
        invoice.printingInvoice();

        InvoiceBySingleResponsibilityPrinciple invoice1 = new InvoiceBySingleResponsibilityPrinciple(new Marker("TextMarker", "white", 20, 6), 3);
        InvoiceDao invoiceDao = new InvoiceDao(invoice1);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice1);
        invoiceDao.saveToDB();
        invoicePrinter.print();
        invoice1.calculateTotal();


    }
}
