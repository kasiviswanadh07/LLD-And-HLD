package com.viswa.solidprinciples.dependencyinversionprinciple;

public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook(WiredKeyboard keyboard, WiredMouse mouse) {
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
