package com.sanggoe.test;

public class Bird implements Flyer {
    int age;

    public Bird(int age) {
        this.age = age;
    }

    @Override
    public void fly() {
        if (age < 2) {
            System.out.println("날개를 휘저으며 날아감");
            age++;
        } else {
            System.out.println("새가 나이가 많아 더이상 날 수 없습니다.");
        }
    }

    @Override
    public boolean isAnimal() {
        return true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
