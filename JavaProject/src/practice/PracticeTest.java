package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTest {
    int a, b = 10;

    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<Integer>();  // 클래스명 뒤에 <타입을> 을 추가하여 사용
        ArrayList<Integer> list = new ArrayList<>(); // 뒤에는 생략가능

        list.add(10);     // 원래는 list.add(new Integer(10)); 이 오토 박싱이 되것임. (Integer 클래스 객체라는 말)
        list.add(20);
        list.add(30);

//        list.add("30");     // 원래는 list.add(new String("30")); 이 오토박싱 된것임. (String 클래스 객체라는 말)


        Integer i = (Integer)list.get(2);
        System.out.println(i);

    }
}








