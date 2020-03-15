package com.sanggoe.chap10_exception_handling.try_catch;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.langString2");
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not existed.");
        }
    }
}
