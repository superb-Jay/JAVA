package practice;

import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        String[] strArray = before.split("");
        String[] strArray2 = after.split("");
        Arrays.sort(strArray);
        Arrays.sort(strArray2);

        if(new String(Arrays.toString(strArray)).equals(new String(Arrays.toString(strArray2)))) {
            answer = 1;
        }
        return answer;

    }
}
public class Programmers {

    public static void main(String[] args) {

        String before = "allpe";
        String after = "apple";
        System.out.println(new Solution().solution(before,after));

    }

}




