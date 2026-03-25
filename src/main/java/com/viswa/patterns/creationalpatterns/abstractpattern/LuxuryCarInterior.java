package com.viswa.patterns.creationalpatterns.abstractpattern;

public class LuxuryCarInterior implements CarInterior{
    @Override
    public void addInteriorComponents() {
        System.out.println("Adding basic Interior components for Luxury Car.");
    }
}
