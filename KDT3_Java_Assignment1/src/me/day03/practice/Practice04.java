package me.day03.practice;

import java.util.Scanner;


public class Practice04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double num1;
        double num2;


            System.out.println("4분면 판단 프로그램 입니다.");
            System.out.println("4분면 위에 2개의 점의 값을 입력하면 어떤 4분면에 속하는진 알려드립니다.");

            System.out.println("X축의 값 입력(실수의 값도 가능)");
            num1 = in.nextDouble();
            System.out.println("Y축의 값 입력(실수의 값도 가능)");
            num2 = in.nextDouble();

            if(num1 >0 && num2 >0) {
                System.out.println("1사분면입니다.");
            }else if(num1 <0 && num2 >0){
                System.out.println("2사분면입니다.");
            }else if(num1 <0 && num2 <0){
                System.out.println("3사분면입니다.");
            }else if(num1 >0 && num2 <0){
                System.out.println("4사분면입니다.");
            }else if(num1 == 0 && num2 == 0){
                System.out.println("원점입니다.");




        }
    }
}



