package com.sanggoe.chap6_class;

public class GetterSetterExample {
    public static void main(String[] args) {
        GetterSetterCar myCar = new GetterSetterCar();

        // wrong change speed
        myCar.setSpeed(-50);

        System.out.println("current speed: " + myCar.getSpeed());

        // right change speed
        myCar.setSpeed(60);

        // stop
        if(!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("current speed: " + myCar.getSpeed());
    }
}
