package practice;



class Solution {
    public String solution(String my_string) {
        String answer = "";
        String pattern = "[a,e,i,o,u]";
        my_string = my_string.replaceAll(pattern,"");

        answer = my_string;

        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        String my_string = "nice to meet you";

        System.out.println(new Solution().solution(my_string));

    }

}




