package com.sanggoe.chap5_reference_type;

// 배열 전체 합과 평균
public class ReferenceTypeExercise2 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int length = 0;
        double avg = 0.0;

        for (int[] scores : array) {
            length += scores.length;
            for (int score : scores) {
                sum += score;
            }
        }
        avg = (double) sum / length;

        System.out.println("Sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
