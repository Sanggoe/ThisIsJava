package com.sanggoe.chap7_inheritance.calculator;

public class Computer extends Calculator {
    @Override
    double areaCircle(double r) {
        System.out.println("process Computer.areaCircle( )");
        return Math.PI * r * r;
    }
}