package practice;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] array = {"aya", "ye", "woo", "ma"};

        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].contains(babbling[j]))
                answer++;
            }
        }

        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

       String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        System.out.println(new Solution().solution(babbling));

    }

}



