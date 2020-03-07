package com.sanggoe.chap4_conditionals_loops_statements;

import java.util.Scanner;

public class DoWileExample {
    public static void main(String[] args) {
        System.out.println("Input message");
        System.out.println("Press 'q' if you want to exit");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);        } while (!inputString.equals("q"));        System.out.println();
        System.out.println("exit program");
    }
}
