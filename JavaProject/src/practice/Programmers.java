package practice;

import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String checkStr = "";
        Arrays.sort(spell);
        for (int i = 0; i < spell.length; i++) {
            checkStr+=spell[i];
        }
//        System.out.println(checkStr);

        for (int i = 0; i < dic.length ; i++) {
            char[] chars = dic[i].toCharArray();
            Arrays.sort(chars);
            dic[i] = new String(chars);

            if(dic[i].equals(checkStr)) {
                answer =1;
            }
        }
//        System.out.println(Arrays.toString(dic));
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        String[] spell = {"s", "o", "m", "d"};
        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};

        System.out.println(new Solution().solution(spell, dic));

    }

}




