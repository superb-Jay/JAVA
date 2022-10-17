package me.day05.practice;

import java.util.Scanner;

public class Practice07 {

//    모든 대문자를 소문자로 변환하고 영숫자가 아닌 문자를 모두 제거한 후 앞뒤로 똑같이 읽는다면 구는 회문입니다.
//    영숫자 문자에는 문자와 숫자가 포함됩니다.
//    문자열 s가 주어지면 회문이면 true를 반환하고 그렇지 않으면 false를 반환합니다.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String match = "[^a-zA-Z]";

        boolean check;


        String s = in.nextLine().toLowerCase();
        String output = s.replaceAll(match,"");



        for (int i = 0; i < output.length()/2 ; i++) {

            if(output.charAt(i) != output.charAt(output.length()-i-1)) {
                check = false;
                System.out.println(check);
                return;
            }
        }

        check = true;
        System.out.println(check);



    }
}
