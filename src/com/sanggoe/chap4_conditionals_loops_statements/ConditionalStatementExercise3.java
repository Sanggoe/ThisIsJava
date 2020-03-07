package com.sanggoe.chap4_conditionals_loops_statements;

public class ConditionalStatementExercise3 {
    public static void main(String[] args) {
        int x, y;

        for (x = 1; x <= 10; x++) {
            for (y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
