package practice;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int count = 0;

        for (int i = 0; i < num_list.length/n ; i++) {
            for (int j = 0; j < n ; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }

//        for (int i = 0; i < answer.length ; i++) {
//            for (int j = 0; j <answer[i].length ; j++) {
//                System.out.print(answer[i][j]);
//            }
//            System.out.println();
//        }


        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;



        System.out.println(new Solution().solution(num_list,n));

    }

}




