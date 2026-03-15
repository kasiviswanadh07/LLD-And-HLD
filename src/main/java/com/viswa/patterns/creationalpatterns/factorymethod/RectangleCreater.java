package com.viswa.patterns.creationalpatterns.factorymethod;

import com.viswa.patterns.creationalpatterns.Rectangle;
import com.viswa.patterns.creationalpatterns.Shape;

public class RectangleCreater extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
