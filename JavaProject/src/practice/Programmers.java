package practice;

import java.util.LinkedList;

class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] strArr = s.split(" ");
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < strArr.length ; i++) {
            if (strArr[i].equals("Z")) {
                list.pop();
            }else{
                list.push(strArr[i]);
            }
        }
        System.out.println(list);

        for (String s1 : list) {
            answer+=Integer.parseInt(s1);
        }

        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {


        String s = "1 2 Z 3";

        System.out.println(new Solution().solution(s));

    }

}




