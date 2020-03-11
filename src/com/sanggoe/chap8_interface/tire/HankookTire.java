package com.sanggoe.chap8_interface.tire;

public class HankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("Roll the HankookTire");
    }
}
