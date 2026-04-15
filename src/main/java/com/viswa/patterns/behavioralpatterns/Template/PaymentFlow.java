package com.viswa.patterns.behavioralpatterns.Template;

public abstract class PaymentFlow {
    public abstract void validateRequest();

    public abstract void calculateFees();

    public abstract void debitAmount();

    public abstract void CreditAmount();

    public final void sendMoney() {
        validateRequest();
        calculateFees();
        debitAmount();
        CreditAmount();
    }
}

