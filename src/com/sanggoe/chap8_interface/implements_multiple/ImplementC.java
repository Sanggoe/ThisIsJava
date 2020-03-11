package com.sanggoe.chap8_interface.implements_multiple;

public class ImplementC implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("ImplementC-methodA( ) running");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementC-methodB( ) running");
    }

    @Override
    public void methodC() {
        System.out.println("ImplementC-methodC( ) running");
    }
}
