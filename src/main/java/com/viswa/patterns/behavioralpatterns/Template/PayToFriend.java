package com.viswa.patterns.behavioralpatterns.Template;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate Logic to pay friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate fees Logic to pay friend");
    }

    @Override
    public void debitAmount() {
        System.out.println("debitAmount Logic to pay friend");
    }

    @Override
    public void CreditAmount() {
        System.out.println("CreditAmount Logic to pay friend");
    }
}
