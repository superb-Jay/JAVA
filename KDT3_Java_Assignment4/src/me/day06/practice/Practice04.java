package me.day06.practice;

import java.util.Scanner;

public class Practice04 {
    public Practice04() {
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int score = 0;
        int T = in.nextInt();

        String str;
        for (int i = 0; i < T ; i++) {

            str = in.next();
            int sum=0,cnt=0;

            for (int j = 0; j < str.length() ; j++) {
                if(str.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                }else{
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
