package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest {

    public static void main(String[] args) {


        String str = "abc";

        Optional<String> optional = Optional.of(str);
        Optional<String> optional1 = Optional.of("abc");
//        Optional<String> optional2 = Optional.of(null);  // 이렇게 하면 안됨.
        Optional<String> optional3 = Optional.ofNullable(null);
        // 널이 될수 있는 값은 오프널어블 안에 넣어두자.

        Optional<String> optional2 = Optional.empty(); // 널로 초기화


//        System.out.println(optional);
//        System.out.println(optional1);
////        System.out.println(optional2);
//        System.out.println(optional3);

        //가져오기

        String str1 = optional3.orElse(""); // 널이면 빈문자열을 반납 해라.

        boolean isnull = optional3.isPresent();
        System.out.println(isnull); // isPresent()  옵셔널 값이 널이면 false가 나옴.

        if(!(optional3.isPresent())) {
            System.out.println("기본 fasle를 반환하는데 !붙여서 if 문을 옵셔널 값이 널일때 실행을 시킬수 있다.");
        }


    }
}
