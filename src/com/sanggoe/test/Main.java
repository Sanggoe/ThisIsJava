package com.sanggoe.test;

public class Main {
    public static void main(String[] args) {
        Flyer bird = new Bird(0);
        Flyer airPlane = new AirPlane(100);


        bird.fly();
        bird.fly();
        bird.fly();
        if (bird.isAnimal()) {
            System.out.println("Bird는 Animal 입니다.\n");
        } else {
            System.out.println("Bird는 Animal이 아닙니다.\n");
        }

        airPlane.fly();
        airPlane.fly();
        if (airPlane.isAnimal()) {
            System.out.println("AirPlane은 Animal 입니다.\n");
        } else {
            System.out.println("AirPlane은 Animal이 아닙니다.\n");
        }
    }
}
