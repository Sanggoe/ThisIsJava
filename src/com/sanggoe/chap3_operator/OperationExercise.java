package com.sanggoe.chap3_operator;

public class OperationExercise {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        // pencils per student
        int pencilsPerStudent = (pencils / students);
        System.out.println(pencilsPerStudent);

        // left pencils
        int pencilsLeft = (pencils % students);
        System.out.println(pencilsLeft);
    }
}
