package com.sanggoe.chap2_value_and_type;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println(charValue + "의 유니코드=" + intValue);

        intValue = 500;
        long longValue = intValue;
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;
        System.out.println(doubleValue);
    }
}
