package practice;


import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 1;

        for (int i = 1; i <= 10  ; i++) {
            temp *= i;
            list.add(temp);
        }
        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) == n) {
                answer = i+1;
                break;
            }
            if(list.get(i) > n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

       int n = 7;
        System.out.println(new Solution().solution(n));

    }

}




