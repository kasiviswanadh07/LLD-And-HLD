package com.viswa.patterns.structuralpatterns.bridge;

public class Client {
    public static void main(String[] args) {
        System.out.println("======= Bridge Design Pattern - Solution Demo == == == ");
        LivingThings dog = new Dog(new LungBreathing());
        LivingThings fish = new Fish(new GrillBreathing());


        LivingThings tree = new Tree(new Photosynthesis());
        dog.breath();
        fish.breath();
        tree.breath();
    }
}

