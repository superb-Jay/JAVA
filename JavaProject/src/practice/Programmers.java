package practice;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);

        answer = array[array.length/2];

        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int[] array = {1, 2, 7, 10, 11};

        System.out.println(new Solution().solution(array));

    }

}




