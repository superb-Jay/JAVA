package me.day04.practice;

public class Practice08 {
    public static void main(String[] args) {
        // example1, example2을 번갈아가며 실행해보세요.
        // 두 예제 모두 무한루프가 발생하게 되는데 발생하지 않도록 코드를 수정해보세요.
        example1();
        example2();
    }
    public static void example1() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    public static void example2() {
        int k = 1;
        while (k <= 5) {
            int l = 1;
            while (l <= 5) {
                System.out.print("*");
                l++;
            }
            System.out.println();
            k++;

        }
    }
}
