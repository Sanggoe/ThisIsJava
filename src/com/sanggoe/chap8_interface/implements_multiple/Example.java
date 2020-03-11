package com.sanggoe.chap8_interface.implements_multiple;

public class Example {
    public static void main(String[] args) {
        ImplementC impl = new ImplementC();
        impl.methodA();
        impl.methodB();
        impl.methodC();
        System.out.println();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
