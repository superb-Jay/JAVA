package practice;


import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        ArrayList<Integer> numberslist = new ArrayList<>(Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new)));

        while (numberslist.size() < k*2) {
            for (int i = 0; i < numbers.length; i++) {
                numberslist.add(numbers[i]);
            }
        }
        System.out.println(numberslist);

        answer = numberslist.get(k*2-2);
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};
        int k = 5;


        System.out.println(new Solution().solution(numbers,k));

    }

}




