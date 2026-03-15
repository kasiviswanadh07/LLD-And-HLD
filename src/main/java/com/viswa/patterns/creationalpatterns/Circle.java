package com.viswa.patterns.creationalpatterns;

public class Circle implements Shape {
    @Override
    public void computeShape() {
        System.out.println("Inside Circle::computeArea() method.");
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
