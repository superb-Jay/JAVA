package practice;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] strArr = rsp.split("");

        for (int i = 0; i < strArr.length; i++) {

            switch (strArr[i]) {

                case "2":
                    answer += 0;
                    break;
                case "0":
                    answer += 5;
                    break;
                case "5":
                    answer += 2;
                    break;
            }
        }
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        String rsp = "2";

        System.out.println(new Solution().solution(rsp));

    }

}




