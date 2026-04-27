package com.viswa.interviewQuestions.parking_Lot.Payment;

public class CashPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Cash paid: " + amount);
        return true;
    }
}
