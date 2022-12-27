package practice;


import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        answer = Math.max(numbers[numbers.length-1] * numbers[numbers.length-2],numbers[0]*numbers[1]);
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int[] numbers = {0, -31, 24, 10, 1, 9};
        System.out.println(new Solution().solution(numbers));

    }

}




