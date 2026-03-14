package com.viswa.solidprinciples.openclosedPrinciple;

import com.viswa.solidprinciples.Invoice;
import com.viswa.solidprinciples.Marker;

public class main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("TextMarker", "white", 20, 6), 3);
        invoice.calculateTotal();
        DataBaseInvoiceDao dataBaseInvoiceDao=new DataBaseInvoiceDao(invoice);
        dataBaseInvoiceDao.save();
        FileInvoiceDao fileInvoiceDao=new FileInvoiceDao(invoice);
        fileInvoiceDao.save();



    }
}
