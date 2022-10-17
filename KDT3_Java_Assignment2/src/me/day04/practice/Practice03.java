package me.day04.practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;
        double sum = 0;
        double avg = 0;
        double num=0;

        for(int i = 0; i < NUM; i++) {
            System.out.println(i+1 + "번째 성적입력>");
            num = sc.nextDouble();
            if(num >=0 && num <= 100) {
                sum += num;
            }else{
                System.out.println("유효한 값을 입력해주세요.");
                i--;

            }



        }
        avg = sum / NUM;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}