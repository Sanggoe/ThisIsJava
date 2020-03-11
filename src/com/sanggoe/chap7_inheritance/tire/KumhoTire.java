package com.sanggoe.chap7_inheritance.tire;

public class KumhoTire extends Tire {
    // Field

    // Constructor
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + " KumhoTire Life: " + (maxRotation - accumulatedRotation) + "times left");
            return true;
        }
        else {
            System.out.println("*** " + location + " KumhoTire punk ***");
            return false;
        }
    }
}
