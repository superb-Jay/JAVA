package practice;

import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int curseNum = 3;

        for (int i = 1; i <=n ; i++) {
            answer++;
            while (answer%curseNum == 0 || String.valueOf(answer).contains(String.valueOf(curseNum)) ) {
                answer++;
            }
        }
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int n = 40;
        System.out.println(new Solution().solution(n));

    }

}




