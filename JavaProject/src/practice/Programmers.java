package practice;


import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        String[] array = new String[board.length];
        String str = "";

        // 110 = 6 / 100 = 4  / 총 25고 / 빈칸이 16

        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[i].length ; j++) {
                 str += String.valueOf(board[i][j]);
            }
            array[i] = str;
            str="";
        }

        System.out.println(Arrays.toString(array));


        System.out.println(board.length);


        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};

        System.out.println(new Solution().solution(board));

    }

}




