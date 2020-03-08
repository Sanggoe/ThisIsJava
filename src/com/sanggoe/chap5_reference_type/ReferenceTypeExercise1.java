package com.sanggoe.chap5_reference_type;

// 배열에서 최대값 찾기
public class ReferenceTypeExercise1 {
    public static void main(String[] args) {
        int max = 0;
        int [] array = { 1, 5, 3, 8, 2};

        for(int arr : array) {
            if(max<arr) {
                max = arr;
            }
        }

        System.out.println("max: " + max);
    }
}
