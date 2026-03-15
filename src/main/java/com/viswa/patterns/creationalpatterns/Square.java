package com.viswa.patterns.creationalpatterns;

public class Square implements Shape {
    @Override
    public void computeShape() {
        System.out.println("Inside Square::draw() method.");
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
