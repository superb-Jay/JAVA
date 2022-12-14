package optional;

import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {

//        int[] arr = null;
        int[] arr = new int[0];
        System.out.println("arr.length? " + arr.length);

        //옵셔널에 null을 저장하고 싶을때?

//        Optional<String> str = null; // 가능은 하나 이렇게 하지말것.
        Optional<String> opt = Optional.of("String"); // 이렇게 해야 함.
        System.out.println(opt);
//        System.out.println(opt.get()); //노써치엘리먼트 익셉션 발생 , 값이 널이기 때문에. 그래서 get은 쓰지마셈

//        try {
//            str = opt.get();
//        } catch (Exception e) {
//            str = ""; // 예외가 발생하면 빈무자열("") 초기화
//        }
//
//        System.out.println(str);

        String str = opt.orElse(""); // 옵셔널에 저장된 값이 null 이면 "" 빈문자열 반환.
        System.out.println(str);

    }
}
