package com.viswa.patterns.structuralpatterns.facade;

public class EcommerceApp {
    public static void main(String[] args) {
        System.out.println("====== Facade Design Pattern Demo == == == ");
        OrderFacade orderFacade=new OrderFacade();

        orderFacade.placeOrder("MacBook Pro", "Credit Card");
        orderFacade.placeOrder("HP", "DebidCard");
    }
}
