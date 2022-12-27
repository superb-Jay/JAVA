package practice;


class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 4; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i%j == 0) {
                    count++;
                }
            }
            if(count>=3) {
                answer++;
                count = 0;
            }
        }

        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

       int n = 10;
        System.out.println(new Solution().solution(n));

    }

}




