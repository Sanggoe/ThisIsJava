package com.sanggoe.chap6_class.account_exercise;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택>");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                default:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 계좌 생성
    private static void createAccount() {
        String ano;
        String owner;
        int balance;

        System.out.println("-------------");
        System.out.println("계좌생성");
        System.out.println("-------------");
        System.out.print("계좌번호: ");
        ano = scanner.next();
        System.out.print("계좌주: ");
        owner = scanner.next();
        System.out.print("초기입금액: ");
        balance = scanner.nextInt();

        for(int i=0; i<accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                break;
            } else if (accountArray[i].getAno().equals(ano)) {
                System.out.println("동일한 계좌가 존재합니다. 계좌 생성 실패");
                break;
            }
        }
    }

    // 계좌 목록 보기
    private static void accountList() {
        System.out.println("-------------");
        System.out.println("계좌목록");
        System.out.println("-------------");

        for (Account account : accountArray) {
                if (account == null) {
                    break;
                }
            System.out.println(account.getAno() + "      " + account.getOwner() + "      " + account.getBalance());
        }
    }

    // 예금 하기
    private static void deposit() {
        String ano;
        int money;
        Account account;

        System.out.println("-------------");
        System.out.println("예금");
        System.out.println("-------------");
        System.out.print("계좌번호: ");
        ano = scanner.next();
        System.out.print("예금액: ");
        money = scanner.nextInt();

        account = findAccount(ano);
        if (account == null) {
            System.out.println("해당 계좌가 없습니다.");
            return;
        }
        money += account.getBalance();
        account.setBalance(money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    // 출금 하기
    private static void withdraw() {
        String ano;
        int money;
        Account account;

        System.out.println("-------------");
        System.out.println("출금");
        System.out.println("-------------");
        System.out.print("계좌번호: ");
        ano = scanner.next();
        System.out.print("출금액: ");
        money = scanner.nextInt();

        account = findAccount(ano);
        if (account == null) {
            System.out.println("해당 계좌가 없습니다.");
            return;
        }

        if (account.getBalance() - money <= 0) {
            System.out.println("계좌 잔고가 부족합니다.");
            return;
        }

        money = account.getBalance() - money;
        account.setBalance(money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    // Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account findAccount(String ano) {

        for (Account account : accountArray) {
            if (account == null) {
                return null;
            } else if (account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
}
