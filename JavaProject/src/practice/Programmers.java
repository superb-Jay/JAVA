package practice;


import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};


        for (int i = 0; i < keyinput.length ; i++) {
            if(keyinput[i].equals("left")) {
                answer[0] -= 1;
            } else if (keyinput[i].equals("right")) {
                answer[0] += 1;
            } else if (keyinput[i].equals("up")) {
                answer[1] += 1;
            } else if (keyinput[i].equals("down")) {
                answer[1] -= 1;
            }

            if(answer[0]<0 && answer[0]<-board[0]/2) {
                answer[0] = -board[0]/2;
            }
            if(answer[0]>0 && answer[0]>board[0]/2) {
                answer[0] = board[0]/2;
            }
            if(answer[1]<0 && answer[1]<-board[1]/2) {
                answer[1] = -board[1]/2;
            }
            if(answer[1]>0 && answer[1]>board[1]/2) {
                answer[1] = board[1]/2;
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




