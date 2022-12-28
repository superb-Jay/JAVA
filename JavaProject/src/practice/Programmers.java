package practice;


import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String pattern = "[a-zA-z]";

        String[] strArr = my_string.split(pattern);
//        System.out.println(Arrays.toString(strArr));
        for (int i = 0; i < strArr.length; i++) {
            if (!(strArr[i].equals(""))) {
                answer += Integer.parseInt(strArr[i]);
            }
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




