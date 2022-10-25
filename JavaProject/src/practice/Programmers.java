package practice;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            for (int j = 0; j < i ; j++) {
                if(priorities[i] < priorities[j]) {
                    int temp = priorities[j];
                    priorities[i] = priorities[j];
                    priorities[i] = temp;
                }

            }
        }




        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int[] var = {2,1,3,2};
        int lo = 2;

        System.out.println(new Solution().solution(var,lo));

    }

}



