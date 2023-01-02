package practice;


import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = 0;

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Z")) {
                list.remove(i);
                list.set(i-1,"0");
            }
        }

        System.out.println(list);

        Integer[] answerArr = list.stream().mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        for (Integer integer : answerArr) {
            answer+=integer;
        }
        return answer;
    }
    // 자료구조 스택을 이용해서 풀이를 나중에 다시 해보자.
}
public class Programmers {

    public static void main(String[] args) {


        String s = "10 Z 20 Z";

        System.out.println(new Solution().solution(s));

    }

}




