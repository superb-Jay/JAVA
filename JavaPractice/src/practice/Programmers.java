package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length ; i++) {
            list.add((score[i][0]+score[i][1])/2);
        }
        list.sort(Collections.reverseOrder());
        System.out.println(list);

        for (int i = 0; i < score.length ; i++) {
            if(((score[i][0]+score[i][1])/2) == list.get(i) ) {
                answer[i] = i+1;
            }
        }
        System.out.println(Arrays.toString(answer));


        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {


        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        System.out.println(new Solution().solution(score));

    }

}




