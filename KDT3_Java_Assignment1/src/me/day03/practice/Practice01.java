package me.day03.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean check = true;
        double koreanScore = 0;
        double mathScore = 0;
        double englishScore = 0;
        double sum = 0;
        double average = 0;

            while(check) {
                System.out.println("국어/수학/영어 성적을 입력해주세요");
                System.out.println("성적의 범위는 0점이상 100점 이하 실수가 입력이 가능하며");
                System.out.println("범위에 해당하는 숫자를 입력하지 않으면 처음부터 다시 입력하셔야 합니다.");

                System.out.println("국어 점수를 입력해 주세요.");
                koreanScore = in.nextDouble();
                    if(koreanScore <=100 && koreanScore > 0) {
                        check = true;
                    }else{
                        System.out.println("성적이 유효하지 않습니다 다시 입력해주세요.");
                        continue;
                    }
                System.out.println("수학 점수를 입력해 주세요.");
                mathScore = in.nextDouble();
                    if(mathScore <=100 && mathScore > 0) {
                        check = true;
                    }else{
                        System.out.println("성적이 유효하지 않습니다 다시 입력해주세요.");
                        continue;
                }
                System.out.println("영어 점수를 입력해 주세요.");
                englishScore = in.nextDouble();
                    if(englishScore <=100 && englishScore > 0) {
                        check = false;
                    }else{
                        System.out.println("성적이 유효하지 않습니다 다시 입력해주세요.");
                    }


            }

        sum = koreanScore+mathScore+englishScore;
        average = sum/3;

        System.out.println("평균을 계산 합니다.");

        System.out.println("평균이 70점 이상이면 합격으로 표시 됩니다.");
        if(average >=70) {
            System.out.println("평균은"+average+"이므로 합격 입니다.");
        }else{
            System.out.println("평균은"+average+"이므로 불합격 입니다.");
        }






    }
}
