package practice;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String[] array = new String[j-i+1];

        for (int u = 0; u < array.length ; u++) {
            array[u] = String.valueOf(i);
            i++;
        }

        for (int l = 0; l < array.length; l++) {
            for (int m = 0; m < array[l].length(); m++) {
                if(String.valueOf(array[l].charAt(m)).equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

        int i = 1;
        int j = 13;
        int k = 1;

        System.out.println(new Solution().solution(i,j,k));

    }

}




