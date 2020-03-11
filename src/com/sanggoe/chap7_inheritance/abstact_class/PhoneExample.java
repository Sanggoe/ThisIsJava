package com.sanggoe.chap7_inheritance.abstact_class;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone();  // Can't be.

        SmartPhone smartPhone = new SmartPhone("Hong gil dong");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
