package com.sanggoe.chap8_interface.tire;

public class Car {
/*
    Tire frontLeftTire = new HankookTire();
    Tire frontReftTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backReftTire = new HankookTire();
*/
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };

    void run() {
/*
        frontLeftTire.roll();
        frontReftTire.roll();
        backLeftTire.roll();
        backReftTire.roll();
*/
        for (Tire tire : tires) {
            tire.roll();
        }
    }
}