package practice;


class Solution {
    public int solution(int price) {
        int answer = 0;

        if(price>=500000) return (int)(price*0.8);
        if(price>=300000) return (int)(price*0.9);
        if(price>=100000) return (int)(price*0.95);

        return price;
    }
}

public class Programmers {

    public static void main(String[] args) {

       int price = 150000;

        System.out.println(new Solution().solution(price));

    }

}




