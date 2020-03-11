package com.sanggoe.chap8_interface.exercise_soundable;

public class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}
