package com.sanggoe.chap8_interface.driver;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare(); ( X )

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
