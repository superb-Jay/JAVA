package practice;


import java.util.Arrays;
import java.util.Map;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        String[] array = new String[board.length];
        String str = "";
        String str1 = "";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                str += String.valueOf(board[i][j]);
            }
            array[i] = str;
            str = "";
            //1,2,4,8,16
        }




        System.out.println(Arrays.toString(array));


        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
//                int[][] board = {{0, 0, 0, 0,0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 1, 1, 0},{0, 0, 0, 0, 0}};

        System.out.println(new Solution().solution(board));

    }

}




