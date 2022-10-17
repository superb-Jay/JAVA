package me.day05.practice;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String phone_number = in.nextLine();
        String answer = " ";

        for (int i = 0; i < phone_number.length()-4 ; i++) {
            answer += "*";
        }

        answer += phone_number.substring(phone_number.length()-4);




    }
}

