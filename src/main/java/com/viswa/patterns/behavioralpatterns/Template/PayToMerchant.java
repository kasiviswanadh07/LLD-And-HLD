package com.viswa.patterns.behavioralpatterns.Template;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate Logic to pay merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate fees Logic to pay merchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("debitAmount Logic to pay merchant");
    }

    @Override
    public void CreditAmount() {
        System.out.println("CreditAmount Logic to pay merchant");
    }
}
