package me.day06.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] scores = new int[10];
        final int COUNT = 10;

        System.out.println("10명의 성적을 입력해주세요.");
        for (int i = 0; i <scores.length ; i++) {
            System.out.println(i+1 + "번째 성적 입력");
            scores[i] = in.nextInt();
        }

        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        double avg =0;

        for (int i = 0; i < scores.length ; i++) {
            sum += scores[i];
        }
        avg = sum/COUNT;


        for (int i = 0; i < scores.length ; i++) {
            if(max < scores[i]) {
                max = scores[i];
            }
        }

        for (int i = 0; i <scores.length ; i++) {
            if(min > scores[i]) {
                min = scores[i];
            }

        }
        System.out.println("최대값은: " + max + " 최소값은: " + min);
        System.out.println();
        System.out.println("평균은 : " + avg);

        double variance = 0;
        double avgVariance = 0;

        for (int i = 0; i < scores.length; i++) {
            variance += Math.pow(scores[i] - avg,2)/COUNT;
        }
        avgVariance = Math.sqrt(variance);

        System.out.println("분산은 : " + variance);
        System.out.println("표준편차 : " + avgVariance);




    }
}
