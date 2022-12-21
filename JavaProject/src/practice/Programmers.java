package practice;


class Solution {
    public String solution(int age) {
        String answer = "";
        //소문자 아스키는 97부터 ,122
        String[] strArr = String.valueOf(age).split("");

        for (int i = 0; i <strArr.length ; i++) {
            answer += (char)(Integer.parseInt(strArr[i]) + 'a');
        }
        return answer;
    }
}


public class Programmers {

    public static void main(String[] args) {

        int age = 23;
        System.out.println(new Solution().solution(age));

    }

}




