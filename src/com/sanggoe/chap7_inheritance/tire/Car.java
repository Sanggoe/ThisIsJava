package com.sanggoe.chap7_inheritance.tire;

public class Car {
    // Field
    Tire frontLeftTire = new Tire("FrontLeft", 6);
    Tire frontRightTire = new Tire("FrontRight", 2);
    Tire backLeftTire = new Tire("backLeft", 3);
    Tire backRightTire = new Tire("backRightTire", 4);

    // Constructor

    // Method
    int run() {
        System.out.println("[Car is running]");
        if (frontLeftTire.roll() == false) {
            stop();
            return 1;
        }
        if (frontRightTire.roll() == false) {
            stop();
            return 2;
        }
        if (backLeftTire.roll() == false) {
            stop();
            return 3;
        }
        if (backRightTire.roll() == false) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("[Car is stopped]");
    }
}
