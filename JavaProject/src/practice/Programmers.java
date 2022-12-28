package practice;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        Integer[] array = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < emergency.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(emergency[i] == array[j]) {
                    answer[i] = j+1;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {

        int[] emergency = {3, 76, 24};



        System.out.println(new Solution().solution(emergency));

    }

}




