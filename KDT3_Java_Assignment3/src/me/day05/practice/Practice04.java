package me.day05.practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String num1 = in.next();
        String num2 = in.next();

        StringBuffer sb = new StringBuffer(num1);
        StringBuffer sb2 = new StringBuffer(num2);

        int rNum1 = Integer.parseInt(sb.reverse().toString());
        int rNum2 = Integer.parseInt(sb2.reverse().toString());

        if(rNum1>rNum2) {
            System.out.println(rNum1);
        }else{
            System.out.println(rNum2);
        }














    }
}

