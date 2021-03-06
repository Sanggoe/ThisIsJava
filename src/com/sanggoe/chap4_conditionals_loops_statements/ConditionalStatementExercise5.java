package com.sanggoe.chap4_conditionals_loops_statements;

import java.util.Scanner;

public class ConditionalStatementExercise5 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------");
            System.out.print("선택>");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("예금액>");
                    balance += scanner.nextInt();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= scanner.nextInt();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("잔고>" + balance);
                    System.out.println();
                    break;
                default:
                    run = false;
                    break;
            }
        }
        System.out.println("\n프로그램 종료");
    }
}