package practice;




class Solution {
    public long solution(int balls, int share) {

        share = Math.min(balls - share, share);

        if (share == 0)
            return 1L;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}
public class Programmers {

    public static void main(String[] args) {

        int balls = 5;
        int share = 3;


        System.out.println(new Solution().solution(balls,share));

    }

}




