package com.sanggoe.chap7_inheritance.tire;

public class HankookTire extends Tire {
    // Field

    // Constructor
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + " HankookTire Life: " + (maxRotation - accumulatedRotation) + "times left");
            return true;
        }
        else {
            System.out.println("*** " + location + " HankookTire punk ***");
            return false;
        }
    }
}
