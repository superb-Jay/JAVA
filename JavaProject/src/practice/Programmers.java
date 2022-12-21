package practice;



class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] arr = {5,3,1};
        int remainHp = 0;

        for (int i = 0; i < arr.length ; i++) {
            answer += hp/arr[i];
            remainHp = hp%arr[i];
            hp = remainHp;
        }

        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int hp = 23;

        System.out.println(new Solution().solution(hp));

    }

}




