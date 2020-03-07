package com.sanggoe.chap4_conditionals_loops_statements;

public class BreakOutsideExample {
    public static void main(String[] args) {
        Outside:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outside;
                }
            }
        }
        System.out.println("exit program");
    }
}
