package practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int i = 2;
        ArrayList<Integer> list = new ArrayList<>();

        while (i<=n) {
            if(n%i == 0) {
                list.add(i);
                n = n / i;
            }else {
                i++;
            }
        }
        Collections.sort(list);
        System.out.println(list);
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
        answer = distinctList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
public class Programmers {

    public static void main(String[] args) {

        int n = 12;


        System.out.println(new Solution().solution(n));

    }

}




