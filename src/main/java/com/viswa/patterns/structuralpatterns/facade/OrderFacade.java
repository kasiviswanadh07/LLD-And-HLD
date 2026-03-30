package com.viswa.patterns.structuralpatterns.facade;

public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();

    }

    public void placeOrder(String productId, String paymentMethod) {
        System.out.println("Placing order for product: " + productId);

        // Step 1: Check stock
        if (!inventoryService.checkStock(productId)) {
            System.out.println("Product out of stock!");
            return;
        }
        if (!paymentService.makePayment(paymentMethod)) {
            System.out.println("Product out of stock!");
            return;
        }
        shippingService.shipProduct(productId);

        // Step 4: Send confirmation
        notificationService.sendConfirmation(productId);

        System.out.println("Order placed successfully!");
    }
}
