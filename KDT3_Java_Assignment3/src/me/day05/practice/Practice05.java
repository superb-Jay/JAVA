package me.day05.practice;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String s = in.nextLine();
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i) == 'P' || s.charAt(i) == 'p') {
                pCount++;
            }else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y'){
                yCount++;
            }

        }

        if(pCount == yCount) {
            System.out.println(true);
        }else if(pCount != yCount) {
            System.out.println(false);
        }else if(pCount == 0 && yCount == 0){
            System.out.println(true);
        }



    }

}



