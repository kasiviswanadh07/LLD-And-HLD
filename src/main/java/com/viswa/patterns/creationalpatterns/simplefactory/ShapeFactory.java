package com.viswa.patterns.creationalpatterns.simplefactory;

import com.viswa.patterns.creationalpatterns.Circle;
import com.viswa.patterns.creationalpatterns.Rectangle;
import com.viswa.patterns.creationalpatterns.Shape;
import com.viswa.patterns.creationalpatterns.Square;

import static com.viswa.patterns.creationalpatterns.simplefactory.ShapeType.CIRCLE;

public class ShapeFactory {
    public static Shape createShapeInstance(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }
        return switch (shapeType) {
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
            case CIRCLE -> new Circle();
        };
    }
}
