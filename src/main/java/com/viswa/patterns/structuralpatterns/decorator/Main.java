package com.viswa.patterns.structuralpatterns.decorator;

public class Main {
    public static void main(String[] args) {

        System.out.println("======= Decorator Design Pattern ======");
        // Create a plain pizza
        BasePizza pizza1 = new PlainPizza();
        System.out.println("Order 1: " + pizza1.getDescription() + " = Rs." + pizza1.getCost());
        //plain pizza with Mushroom pizza
        BasePizza pizza2 = new MushroomTopping(new PlainPizza());
        System.out.println("Order 2: " + pizza2.getDescription() + " = Rs." + pizza2.getCost());
        //plain pizza with Mushroom pizza and pepper
        BasePizza pizza3 = new PepperniTopping(new MushroomTopping(new PlainPizza()));
        System.out.println("Order 3: " + pizza3.getDescription() + " = Rs." + pizza3.getCost());
        BasePizza pizza4 = new ExtraCheeseTopping(new PepperniTopping(new MushroomTopping(new CheckinDominator())));
        //CheckinDominator With Mushroom Topping with pepperniToppingExtra Cheese
        System.out.println("Order 4: " + pizza4.getDescription() + " = Rs." + pizza4.getCost());
    }
}
