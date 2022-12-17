package practice;

import java.util.ArrayList;

class Solution {
    public String[] solution(String[] quiz) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < quiz.length ; i++) {
            String[] array = quiz[i].split(" ");

            for (int j = 0; j < array.length ; j++) {
                if(array[j].equals("-")) {
                    if (Integer.parseInt(array[array.length - 1]) == (Integer.parseInt(array[0]) - Integer.parseInt(array[2]))) {
                        list.add("O");
                    } else {
                        list.add("X");
                    }
                }else if (array[j].equals("+")) {
                    if (Integer.parseInt(array[array.length - 1]) == (Integer.parseInt(array[0]) + Integer.parseInt(array[2]))) {
                        list.add("O");
                    } else {
                        list.add("X");
                    }
                }
            }
        }
        System.out.println(list);
        String[] answer= list.toArray(new String[list.size()]);

        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(new Solution().solution(quiz));

    }

}




