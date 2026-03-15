package com.viswa.patterns.creationalpatterns;

public class Rectangle implements Shape {
    @Override
    public void computeShape() {
        System.out.println("Inside Rectangle::computeShape() method.");
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
