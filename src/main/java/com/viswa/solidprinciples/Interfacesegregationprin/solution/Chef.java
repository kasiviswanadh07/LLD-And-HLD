package com.viswa.solidprinciples.Interfacesegregationprin.solution;

public class Chef implements ChefTask {
    @Override
    public void decideMenu() {
        System.out.println("Deciding Menu for afternoon");
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing for afternoon");
    }
}
