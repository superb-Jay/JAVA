package practice;


class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            answer += coupon/10;
            coupon = coupon/10+coupon%10;
        }

        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {

        int chicken = 1081;

        System.out.println(new Solution().solution(chicken));

    }

}




