package com.sanggoe.chap4_conditionals_loops_statements;

public class ConditionalStatementExercise2 {
    public static void main(String[] args) {
        int i = 0, j = 0;

        while ((i + j) != 5) {
            i = (int) (Math.random() * 6) + 1;
            j = (int) (Math.random() * 6) + 1;
            System.out.println("(" + i + ", " + j + ")");
        }
    }
}
