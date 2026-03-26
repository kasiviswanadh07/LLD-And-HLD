package com.viswa.patterns.nullobjectpattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car("xyz", "white", 4, 30, true);
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike("yamaha", "white", 2, 10, true);
        } else {
            return new NullVehicle();
        }

    }
}
