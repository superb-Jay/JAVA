package practice;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        String[] letterArray = letter.split(" ");

        for (int i = 0; i < letterArray.length ; i++) {
            for (int j = 0; j < morse.length ; j++) {
                if (letterArray[i].equals(morse[j])) {
                    answer += alpha[j];
                }
            }
        }
        return answer;
    }
}

public class Programmers {

    public static void main(String[] args) {

       String letter = ".... . .-.. .-.. ---";
        System.out.println(new Solution().solution(letter));

    }

}




