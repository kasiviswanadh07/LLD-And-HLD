package com.viswa.patterns.structuralpatterns.facade;

public class ShippingService {
    public void shipProduct(String productId) {
        System.out.println("Shipping product: " + productId);
    }
}
