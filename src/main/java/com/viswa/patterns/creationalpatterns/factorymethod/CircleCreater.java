package com.viswa.patterns.creationalpatterns.factorymethod;

import com.viswa.patterns.creationalpatterns.Circle;
import com.viswa.patterns.creationalpatterns.Shape;

public class CircleCreater extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
