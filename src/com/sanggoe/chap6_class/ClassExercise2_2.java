package com.sanggoe.chap6_class;

public class ClassExercise2_2 {
    public static void main(String[] args) {
        ClassExercise2_1 memberService = new ClassExercise2_1();
        boolean result = memberService.login("hong", "12345");
        if(result) {
            System.out.println("Login success.");
            memberService.logout("hong");
        } else {
            System.out.println("id or password is not correct.");
        }
    }
}
