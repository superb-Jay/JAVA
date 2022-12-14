package ramda;

public class Ex14_0 {

    public static void main(String[] args) {

//        Object obj = (a,b) -> a> b ? a:b;

//        MyFunction f = new MyFunction() {
//            public int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };

        MyFunction f = (a,b) -> a>b ? a:b;

        int value = f.max(3,5);
        System.out.println("value = " + value);

    }


    @FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
    interface MyFunction {
        public abstract int max(int a, int b);
    }
}