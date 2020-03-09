package com.sanggoe.chap6_class;

public class Account {
    private int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < MIN_BALANCE) {
            System.out.println("Account Min Error!");
        } else if (balance > MAX_BALANCE) {
            System.out.println("Account Max Error!");
        } else {
            this.balance = balance;
        }
    }
}
