package com.sanggoe.chap8_interface.driver;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Running Bus");
    }

    public void checkFare() {
        System.out.println("Checking Fare");
    }
}
