package com.sanggoe.chap3_operator;

public class InputDataCheckNaNExample {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        if(Double.isNaN(val)) {
            System.out.println("NaN, It can't be processed.");
            val = 0.0;
        }

        currentBalance += val;
        System.out.println(currentBalance);
    }
}
