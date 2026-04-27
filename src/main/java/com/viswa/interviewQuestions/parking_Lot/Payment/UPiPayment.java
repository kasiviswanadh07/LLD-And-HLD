package com.viswa.interviewQuestions.parking_Lot.Payment;

public class UPiPayment implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("UPI paid: " + amount);
        return true;
    }
}
