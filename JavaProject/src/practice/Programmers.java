package practice;

import java.util.Arrays;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        answer = Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));
        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {

        String bin1 = "10";
        String bin2 = "11";
        System.out.println(new Solution().solution(bin1,bin2));

    }

}




