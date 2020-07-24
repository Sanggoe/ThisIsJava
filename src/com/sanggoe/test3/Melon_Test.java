package com.sanggoe.test3;

public class Melon_Test {
    public static void main(String[] args) {
        Melon melon = new Melon();

        melon.setInfo("맛있는 멜론");
        melon.setCal(400);
        melon.setCost(10000);
        melon.setKg(2);

        System.out.println(melon.toString());
    }
}
