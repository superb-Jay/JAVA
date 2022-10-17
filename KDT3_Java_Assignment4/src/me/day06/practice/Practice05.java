package me.day06.practice;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array = new int[26];

        String s = in.next();

        for (int i = 0; i < s.length() ; i++) {

            if(65<= s.charAt(i) && s.charAt(i)<=90) { // 대문자 범위 내에서..
                array[s.charAt(i) - 65]++; // 인데스값 유추
                // 만약에 AB 라는 문자가 입력됫다고 하면. 아스키코드값은 A=65 B=66
                // 새로만든 array 라는 배열은 A~Z 까지의 순서를 나타낸다.
                // 즉 array[0] = a 또는 A , array[1] = b 또는 B
                // 알파벳 1번째는 에이 알파벳 2번째는 비
                // 그러면 AB라는 문자의 아스키코드값 A=65 B=66 이라는 숫자를 가지고
                // 인덱스값을 유추해내려면 -65를 하면 가능해진다.
                // A 65-65 = 0번째 인덱스, B 66-65 = 1번째 인덱스.
                // 가능한 이유는 알파벳은 순서가 있고 순서대로 아스키코드 값이 1씩 증가하기 때문.
            }else{ // 엘스로 처리가 가능한건 대소문자구분없이 알파벳만 입력이 들어온다고 정했기 떄문이고
                  // 그러므로 대문자의 범위만 정확하게 지정하고 그 범위를 벗어나면 소문자라고 단정짓는게
                // 가능하다.
                array[s.charAt(i)-97]++; // 소문자일경우
            }
            // 이코드가 반복이 끝나고 나면 입력받은 문자열의 해당하는 array 배열의 인덱스값이 증가됨을
        }   // 알수있다.

        // 그러면 다시 반복문을 돌려 인덱스안에 값이 가장큰값을 찾으면. 그값에 해당하는 인덱스번호로
        // 알파벳을 유추하면된다. 추가조건) 가장많이 반복된 값이 1개가 아닐경우에는 ?를 출력한다.

        int max = 0; //
        char ch = ' ';

        for (int i = 0; i <array.length; i++) {

            if(max < array[i]) { // array[i] 의 값이 max 값 보다 크면
                max = array[i]; // max의 값에 array[i] 값을 대입한다.
                ch = (char)(i+65); //무조건 대문자를 출력하기 위해 65를 더한다.
                                    //조건을 만족하는 제일 마지막 i의 값이 알파벳 순서라고 보면됨. aa
            }else if(array[i] == max){ // 배열의 최대값이 저장되어있는 max 변수와 array[i]의 값이 같을경우
                ch = '?';              // ch 변수에 ? 값을 저장한다.
                                       // 2가지 조건에 만족하지 않으면 아무것도 하지 않는다.



            }

        }

        System.out.println(ch);



















    }
}
