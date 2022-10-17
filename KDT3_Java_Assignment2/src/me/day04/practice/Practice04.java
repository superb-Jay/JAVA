package me.day04.practice;
import java.util.Scanner;

public class Practice04 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        for(int i=0;i<array.length;i++) {
            for(int j=1+i;j<array.length;j++) {
                System.out.println("("+array[i]+","+array[j]+")");
            }

        }






    }

}
