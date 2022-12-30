package practice;


import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        //up y+1, down y-1, left x-1 right x+1
//      String[] keyinput = {"left", "right", "up", "right", "right"};
        for (int i = 0; i < keyinput.length ; i++) {

            switch (keyinput[i]) {

                case "left":
                    if (Math.abs(answer[0])<board[0]/2) {
                        answer[0] -= 1;
                    }
                    break;
                case "right":
                    if(Math.abs(answer[0])<board[0]/2) {
                        answer[0] += 1;
                    }
                    break;
                case "up":
                    if(Math.abs(answer[1])<board[1]/2) {
                        answer[1] += 1;
                    }
                    break;
                case "down":
                    if(Math.abs(answer[1])<board[1]/2) {
                        answer[1] -= 1;
                    }
                    break;
            }
        }
        System.out.println(Arrays.toString(answer));


        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {


        String[] keyinput = {"left", "left", "left", "right"};
        int[] board = {3,3};


        System.out.println(new Solution().solution(keyinput,board));

    }

}




