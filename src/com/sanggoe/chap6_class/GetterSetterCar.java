package com.sanggoe.chap6_class;

public class GetterSetterCar {
    //Filed
    private int speed;
    private boolean stop;

    public GetterSetterCar() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
            return;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
