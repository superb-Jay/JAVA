package me.day04.practice;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = "";
        int i=0;
        String[] arr = new String[100];
        int size=0;

        while(!(str.equals("q"))){
            System.out.print("문자 입력: ");

            arr[i]=str = sc.next();
            i++;
            size++;
        }

        for(i =size-2; i >= 0; i--){
            System.out.print(arr[i]);
        }



    }

}
