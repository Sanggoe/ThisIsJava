package com.sanggoe.chap8_interface.tire;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();
/*
        myCar.frontLeftTire = new KumhoTire();
        myCar.frontReftTire = new KumhoTire();
*/
        myCar.tires[0] =  new KumhoTire();
        myCar.tires[1] =  new KumhoTire();

        myCar.run();
    }
}
