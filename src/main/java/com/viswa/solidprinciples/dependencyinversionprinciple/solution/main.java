package com.viswa.solidprinciples.dependencyinversionprinciple.solution;

import com.viswa.solidprinciples.dependencyinversionprinciple.MacBook;
import com.viswa.solidprinciples.dependencyinversionprinciple.*;

public class main {
    public static void main(String[] args) {
        WiredKeyboard wiredKeyboard = new WiredKeyboard("wired", "dell", "f513", "Black");
        WiredMouse wiredMouse = new WiredMouse("wired", "hp", "f965", "white");

        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("Bluethooth", "dell", "f513", "Black");
        BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluethooth", "hp", "f965", "white");

        com.viswa.solidprinciples.dependencyinversionprinciple.solution.MacBook macBook = new com.viswa.solidprinciples.dependencyinversionprinciple.solution.MacBook(wiredKeyboard, wiredMouse);
        macBook.getKeyboard().getSpecifications();
        macBook.getMouse().getSpecifications();

        com.viswa.solidprinciples.dependencyinversionprinciple.solution.MacBook  macBook1= new com.viswa.solidprinciples.dependencyinversionprinciple.solution.MacBook(bluetoothKeyboard, bluetoothMouse);
        macBook1.getKeyboard().getSpecifications();
        macBook1.getMouse().getSpecifications();

    }
}
