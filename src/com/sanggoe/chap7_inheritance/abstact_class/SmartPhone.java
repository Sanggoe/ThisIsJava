package com.sanggoe.chap7_inheritance.abstact_class;

public class SmartPhone extends Phone {
    // Constructor
    public SmartPhone(String owner) {
        super(owner);
    }

    // Method
    public void internetSearch() {
        System.out.println("Search the internet");
    }
}
