package practice;

public class PracticeTest {

    public static void main(String[] args) {
        String s = "hello";
        // 문자열에는 인덱스라는 개념 존재
        // 문자열도 문자들의 열거. 즉 배열이기 때문에 문자열 내에 순서가 존재함
        // 인덱스 - 원소 순서대로 번호를 매겨 원소를 접근할 수 있도록 하는 숫자 (0 <=  < 문자열 길이)
        // 인덱싱 - 인덱스를 통해 원소 접근 방법

        // h e l l o
        // 0 1 2 3 4

        char c = s.charAt(0); // 문자형변수 c에 문자열변수 s에 0번째 인덱스 값을 담아라.
        System.out.println(c); // h

        c = s.charAt(s.length()-1); // 문자형변수 c에 문자열변수s에 길이-1의 인덱스 값을 담아라[
        System.out.println(c);
    }


}

