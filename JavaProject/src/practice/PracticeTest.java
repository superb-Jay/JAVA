package practice;

import java.util.*;

public class PracticeTest{
    public static void main(String[] args) {

        int answer = 0;
        int k = 10;
        int[] number = {1,3,5,4,0,0,7,0,0,6};
        int top = -1;
        int[] array = new int[k];

        for (int i = 0; i < k ; i++) {
            if(number[i] == 0) {
                array[top] = 0;
                top--;
            }else{
                top++;
                array[top] = number[i];
            }

        }
        System.out.println(Arrays.toString(array));

        for (int i : array) {
            answer += i;
        }
        System.out.println(answer);
    }
}








