package com.viswa.patterns.creationalpatterns.abstractpattern;

public class EconomyInterior implements CarInterior{
    @Override
    public void addInteriorComponents() {
        System.out.println("Adding basic Interior components for Economy Car.");
    }
}
