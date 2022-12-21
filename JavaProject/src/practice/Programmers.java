package practice;



class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String pattern = "[a-zA-Z]";

        my_string = my_string.replaceAll(pattern,"");

        for (int i = 0; i < my_string.length() ; i++) {
            answer+=Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp";

        System.out.println(new Solution().solution(my_string));

    }

}




