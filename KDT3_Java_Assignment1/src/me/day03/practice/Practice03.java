package me.day03.practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1;
        int num2;
        char ch;
        boolean run = true;


        while(run) {
            System.out.println("계산기 프로그램 입니다.");
            System.out.println("첫번째 숫자를 입력해주세요.");
            num1 = in.nextInt();
            if (num1 % 1 != 0) {
                System.out.println("정수를 입력해주세요.");
                continue;
            }

            System.out.println("두번째 숫자를 입력해주세요.");
            num2 = in.nextInt();
            if (num1 % 1 != 0) {
                System.out.println("정수를 입력해주세요.");
                continue;
            }

            System.out.println("계산할 사칙연산을 입력해주세요");
            System.out.println("+,-,*./ 만 가능합니다.");
            ch = in.next().charAt(0);

            switch(ch) {
                case '+': {
                    System.out.println("덧샘을 계산합니다.");
                    System.out.println(num1+" + "+num2+"= "+(num1+num2) );
                    run = false;
                    break;
                }
                case '-': {
                    System.out.println("뺄샘을 계산합니다.");
                    System.out.println(num1+" - "+num2+"= "+(num1-num2) );
                    run = false;
                    break;
                }
                case '*': {
                    System.out.println("곱샘을 계산합니다.");
                    System.out.println(num1+" * "+num2+"= "+(double)(num1*num2) );
                    run = false;
                    break;
                }
                case '/': {
                    System.out.println("나눗샘을 계산합니다.");
                    System.out.println(num1+" / "+num2+"= "+(double)(num1/num2) );
                    run = false;
                    break;
                }
                default: {
                    System.out.println("연산자가 유효하지 않습니다.");
                    System.out.println("처음부터 다시 입력해주세요. \n");
                }

            }




        }



    }
}
