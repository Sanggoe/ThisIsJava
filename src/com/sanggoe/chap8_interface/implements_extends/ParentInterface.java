package com.sanggoe.chap8_interface.implements_extends;

public interface ParentInterface {
    public void method1();
    public default void method2() {
        System.out.println("ParentInterface method2( ) running");
    }
}
