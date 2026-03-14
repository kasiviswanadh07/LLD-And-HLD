package com.viswa.solidprinciples.dependencyinversionprinciple.solution;

import com.viswa.solidprinciples.dependencyinversionprinciple.Keyboard;
import com.viswa.solidprinciples.dependencyinversionprinciple.Mouse;
import com.viswa.solidprinciples.dependencyinversionprinciple.WiredKeyboard;
import com.viswa.solidprinciples.dependencyinversionprinciple.WiredMouse;

public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
