package me.day05.practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        StringTokenizer st = new StringTokenizer(str," ");

        System.out.println(st.countTokens());



    }
}
