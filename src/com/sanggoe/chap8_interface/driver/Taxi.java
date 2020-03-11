package com.sanggoe.chap8_interface.driver;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("Running Taxi");
    }
}
