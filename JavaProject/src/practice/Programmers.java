package practice;


class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <=n; i++) {
            if(n%i == 0) {
                answer++;
            }
        }
        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {

       int n = 100;

        System.out.println(new Solution().solution(n));

    }

}




