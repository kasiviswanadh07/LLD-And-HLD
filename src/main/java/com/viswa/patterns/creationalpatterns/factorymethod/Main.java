package com.viswa.patterns.creationalpatterns.factorymethod;

import com.viswa.patterns.creationalpatterns.Shape;
import com.viswa.patterns.creationalpatterns.simplefactory.ShapeType;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= Factory Method Design Pattern ======");
        ShapeType shapeType = ShapeType.CIRCLE;
        Shape shape = getShapeInstance(shapeType);
        shape.computeShape();
        shape.draw();

    }
    private static Shape getShapeInstance(ShapeType shapeType) {
        Shape shape = null;
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case CIRCLE:
                ShapeFactory circleCreator = new CircleCreater();
                shape = circleCreator.createShape();
                break;
            case RECTANGLE:
                ShapeFactory rectangleCreator = new
                        RectangleCreater();
                shape = rectangleCreator.createShape();
                break;
            case SQUARE:
                ShapeFactory squareCreator = new SquareCreater();
                shape = squareCreator.createShape();
                break;
            default:
                throw new IllegalStateException("ShapeType doesn't exist.");
        }
        return shape;
    }
}
