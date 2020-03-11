package com.sanggoe.chap7_inheritance.tire;

public class Tire {
    // Field
    public int maxRotation;
    public int accumulatedRotation;
    public String location;

    // Constructor

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // Method
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " Tire life: " + (maxRotation - accumulatedRotation) + " times left");
            return true;
        } else {
            System.out.println("*** " + location + " Tire punk ***");
            return false;
        }
    }
}
