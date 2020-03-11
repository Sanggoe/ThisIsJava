package com.sanggoe.chap7_inheritance.vehicle;

public class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("The Taxi is running");
    }
}