package com.viswa.patterns.creationalpatterns.factorymethod;

import com.viswa.patterns.creationalpatterns.Shape;
import com.viswa.patterns.creationalpatterns.Square;

public class SquareCreater extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
