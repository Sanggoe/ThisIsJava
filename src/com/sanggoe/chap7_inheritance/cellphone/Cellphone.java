package com.sanggoe.chap7_inheritance.cellphone;

public class Cellphone {
    // Field
    String model;
    String color;

/*    // Constructor
    public Cellphone(String model, String color) {
        this.model = model;
        this.color = color;
    }
*/

    // Method
    void powerOn() {
        System.out.println("Turn on the power");
    }

    void powerOff() {
        System.out.println("Turn off the power");
    }

    void bell() {
        System.out.println("ring~ ring~ Bell");
    }

    void sendVoice(String message) {
        System.out.println("You: " + message);
    }

    void receiveVoice(String message) {
        System.out.println("Other: " + message);
    }

    void hangUp() {
        System.out.println("exit call");
    }
}
