package com.sanggoe.chap6_class;

public class ClassExercise2_1 {

    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

    void logout(String id) {
        System.out.println("Logout completed.");
    }
}