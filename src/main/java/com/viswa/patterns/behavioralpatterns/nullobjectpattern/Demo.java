package com.viswa.patterns.behavioralpatterns.nullobjectpattern;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("car");
        testDrive(vehicle);
        printVehicleDetails(vehicle);
        Vehicle vehicles = VehicleFactory.getVehicle("");
        testDrive(vehicles);
        printVehicleDetails(vehicles);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        if (vehicle instanceof Car car) {

            System.out.print("\n[+] Vehicle Details: ");
            System.out.println(car.getClass().getSimpleName() + " [Model = " + car.getModel()
                    + ", Color=" + car.getColor() + ", Seating Capacity = " + car.getSeatingCapacity()
                    + ", Fuel Tank Capacity=" + car.getFuelTankCapacity() + "]");
        }
        if (vehicle instanceof
                Bike bike) {
            System.out.print("\n[+] Vehicle Details: ");
            System.out.println(bike.getClass().getSimpleName() + " [Model = " + bike.getModel()
                    + ", Color=" + bike.getColor() + ", Fuel Tank Capacity = " + bike.getFuelTankCapacity() + "]");
        }
    }

    private static void testDrive(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();


    }

}


