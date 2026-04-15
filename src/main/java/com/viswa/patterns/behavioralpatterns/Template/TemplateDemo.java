package com.viswa.patterns.behavioralpatterns.Template;

public class TemplateDemo {
    public static void main(String[] args) {
        System.out.println("###### Template Method Design Pattern ######");

                // Bank Transfer
                System.out.println("===== Bank Transfer =====");
         PaymentFlow payToFriend = new PayToFriend();
         payToFriend.sendMoney(); // Template method

         // Merchant Payment
        // System.out.println("===== Merchant Payment =====");
        PaymentFlow merchantPayment = new PayToMerchant();
         merchantPayment.sendMoney(); // Template method
    }
}
