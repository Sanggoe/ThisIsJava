package com.sanggoe.chap9_nested_class_interface.access_modifier;

public class A {
    // Instance field
    B field1 = new B();
    C field2 = new C();

    // Instance method
    void method1() {
        B var1 = new B();
        C var2 = new C();
    }

    // Initialize static field
    //static B field3 = new B();
    static C field4 = new C();

    // Initialize static method
    static void method2() {
        //B var1 = new B();
        C var2 = new C();
    }

    // Instance member class
    class B {
    }

    // Static member class
    static class C {
    }
}
