package me.day03.practice;

import java.util.Locale;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str;
        char ch;

        while(true) {

            System.out.println("입력한 영문자가 소문자라면 대문자로 변경하여 출력됩니다.");
            System.out.println("만약 입력한 문자가 영문자가 아니라면 영문자가 유효하지 않습니다를 출력");
            System.out.println("영문자를 입력해주세요.");
            str = in.nextLine();
            ch = str.charAt(0);

            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("소문자가 아닙니다.");
                System.out.println("다시 입력해주세요. \n");
                continue;
            }

            if (ch >= 'a' && ch <= 'z') {
                System.out.println("입력한 문자 " +ch+"를 대문자로 변환합니다.\n" +"변환한 대문자: "+ str.toUpperCase());
                break;
            } else {
                System.out.println("영문자가 유효하지 않습니다.");
                System.out.println("다시 입력해주세요.\n");

            }


        }




    }
}
