package practice;


import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n ; i++) {
            if(i%2 != 0) {
                list.add(i);
            }
        }
        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {

        int n = 10;

        System.out.println(new Solution().solution(n));

    }

}




