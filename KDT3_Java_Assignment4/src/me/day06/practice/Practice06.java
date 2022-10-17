package me.day06.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 6; // 테스트 케이스 2 /스캐너로 입력받으면 다른테스트도 가능.

        int[] arr1 = {46, 33, 33, 22, 31, 50}; // 테스트케이스 2 /스캐너로 입력받으면 다른테스트도 가능.
        int[] arr2 = {27, 56, 19, 14, 14, 10}; // 테스트케이스 2 /스캐너로 입력받으면 다른테스트도 가능.


        int[] map = new int[n]; // 두장을 겹친 지도를 저장할 배열을 선언
        String[] answer = new String[n]; // 문자열 타입의 정수배열 선언 길이는 위에서 입력한만큼

        for (int i = 0; i < n; i++) {
            map[i] = arr1[i] | arr2[i]; // 지도 1과 2를 겹쳐서 두개중 한개라도 참이면 참이고, 거짓이면 거짓이다.
        }                               // 라는 것은 두 지도의 OR 연산을 의미.
        // 현재 map 이라는 배열에는 정수배열 arr1, arr2  의 or 연산이 된 값이
        // 10진수로 저장되어있다.

        //지도는 벽(#)이 1 이고 공백(" ")이 0 이다.
        //map 배열의 0번째 인덱스값을 2진수값으로 변경한것을 벽과, 공백으로 바꾸어서 스트링 타입의 배열에
        // 저장하고 그것을 출력 하는것이 관건.

        for (int i = 0; i < map.length; i++) {
            answer[i] = Integer.toBinaryString(map[i]); // map[i]값을 2진수 스트링타입으로 변환하여
            if (answer[i].length() != n) {
                answer[i] = "0".repeat(n - answer[i].length()) + answer[i];
            }
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        System.out.println(Arrays.toString(answer));

    }
}
