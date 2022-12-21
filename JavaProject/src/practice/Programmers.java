package practice;

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};

        String pattern = "[a-zA-z]";

        my_string = my_string.replaceAll(pattern,"");
        String[] strArray = my_string.split("");
        Arrays.sort(strArray);
        answer = Arrays.stream(strArray).mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        String my_string = "hi12392";

        System.out.println(new Solution().solution(my_string));

    }

}




