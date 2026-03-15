package com.viswa.patterns.structuralpatterns.decorator;

public class ThandooriPannerDelight implements BasePizza {
    @Override
    public String getDescription() {
        return "ThandooriPannerDelight";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
