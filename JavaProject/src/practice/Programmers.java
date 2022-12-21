package practice;



class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;

        for (int i = 0; i < box.length ; i++) {
            answer*= (int) box[i] /n;
        }
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int[] box = {10,8,6};
        int n = 3;

        System.out.println(new Solution().solution(box,n));

    }

}




