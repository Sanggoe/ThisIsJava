package com.sanggoe.chap8_interface.implements_extends;

public interface ChildInterface2 extends ParentInterface {
    @Override
    default void method2() {
        System.out.println("ChildInterface2 method( ) running");
    }

    public void method3();
}
