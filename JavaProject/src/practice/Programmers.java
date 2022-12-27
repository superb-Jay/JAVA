package practice;



class Solution {
    public int solution(int n) {
        int answer = 0;
        int slacePizza = 6;

        for (int i = 0; i < slacePizza*n ; i++) {
            if(slacePizza%n == 0) {
                answer = slacePizza/6;
                break;
            }
            slacePizza+=6;
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




