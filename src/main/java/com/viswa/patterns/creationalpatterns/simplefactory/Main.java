package com.viswa.patterns.creationalpatterns.simplefactory;

import com.viswa.patterns.creationalpatterns.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= Simple Factory Design Pattern======");
        Shape shape = ShapeFactory.createShapeInstance(ShapeType.CIRCLE);
        shape.computeShape();
        shape.draw();

        Shape shapeRec = ShapeFactory.createShapeInstance(ShapeType.RECTANGLE);
        shapeRec.draw();
        shapeRec.computeShape();

    }
}
