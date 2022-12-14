package practice;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int centerNum = total / num; // 4
        int subNum = total % num == 0 ? num/2 : num/2-1;

        int startNum  = centerNum - subNum;

        for (int i = 0; i < answer.length ; i++) {
            answer[i] = startNum+i;
        }

        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int num = 5;
        int total = 5;


        System.out.println(new Solution().solution(num, total));

    }

}




