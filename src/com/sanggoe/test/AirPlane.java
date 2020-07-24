package com.sanggoe.test;

public class AirPlane implements Flyer {
    int oil;

    public AirPlane(int oil) {
        this.oil = oil;
    }

    @Override
    public void fly() {
        if (oil > 0) {
            System.out.println("엔진과 날개를 이용하여 날아감");
            if (oil > 100) {
                oil -= 100;
            } else {
                oil = 0;
            }
        } else {
            System.out.println("연료가 부족합니다.");
        }
    }

    @Override
    public boolean isAnimal() {
        return false;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
