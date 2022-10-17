package me.day05.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
//    Sally의 그룹 채팅방
//    카카오톡 그룹 채팅방은 모두가 메시지를 볼 수 있습니다.
//    개인적으로 질문하고 싶은 Sally는 다른 사람들이 한번에 메시지를 확인할 수 없도록 일정 규칙 을 만들려고 합니다.
//    입력받은 한 문장에서 각 단어의 첫 글자는 소문자로 작성하고 나머지 글자는 대문자로 작성할 수 있도록 작성합니다.

//   예시) 메시지 입력: Hello Sally
//         hELLO sALLY Hello SALLY  HELLO SALLY

        Scanner in = new Scanner(System.in);

        String str;

        System.out.println("문자입력>"); // hello SALLY
        str = in.nextLine().toUpperCase(); // HELLO SALLY

        for(int i=0;i<str.length();i++) {
            if(i==0) {
                System.out.print(Character.toLowerCase(str.charAt(0)));
            }else if(str.charAt(i) == ' ' ) {
                System.out.print(" " + Character.toLowerCase(str.charAt(i+1)));
                i++;
            }else{
                System.out.print(str.charAt(i));
            }


        }





    }
}
