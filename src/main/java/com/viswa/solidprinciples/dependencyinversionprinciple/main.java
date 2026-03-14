package com.viswa.solidprinciples.dependencyinversionprinciple;

public class main {
    public static void main(String[] args) {
        WiredKeyboard wiredKeyboard = new WiredKeyboard("wired", "dell", "f513", "Black");
        WiredMouse wiredMouse = new WiredMouse("wired", "hp", "f965", "white");

        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("Bluethooth", "dell", "f513", "Black");
        BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluethooth", "hp", "f965", "white");

        MacBook macBookWithWiredParts = new MacBook(wiredKeyboard, wiredMouse);
        macBookWithWiredParts.getKeyboard().getSpecifications();
        macBookWithWiredParts.getMouse().getSpecifications();

       /*MacBook macBookWithbluetoothParts = new MacBook(bluetoothKeyboard, bluetoothMouse);
        Bluethooth objects not working because in mac class we are creating using wired objects if we want both wired and bluethooth parts has
       to be create*/
    }
}
