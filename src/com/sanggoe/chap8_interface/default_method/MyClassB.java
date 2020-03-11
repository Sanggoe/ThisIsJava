package com.sanggoe.chap8_interface.default_method;

public class MyClassB implements MyInterface {
    @Override
    public void method1() {
        System.out.println("MyClassB-method1( ) running");
    }

    @Override
    public void method2() {
        System.out.println("MyClassB-method2( ) running");

    }
}
