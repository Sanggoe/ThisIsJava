package com.sanggoe.chap5_reference_type;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{83, 90, 87};
        int sum1 = 0;
        for (int i : scores) {  // 향상된 for문 사용
            sum1 += i;
        }
        System.out.println("Total : " + sum1);

        int sum2 = add(new int[]{83, 90, 87});
        System.out.println("Total : " + sum2);
        System.out.println();
    }

    public static int add(int[] scores) {
        int sum = 0;
        for (int i : scores) {  // 향상된 for문 사용
            sum += i;
        }
        return sum;
    }
}
