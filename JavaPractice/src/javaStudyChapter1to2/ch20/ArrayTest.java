package javaStudyChapter1to2.ch20;

public class ArrayTest {
    public static void main(String[] args) {

        int[]arr = new int[10];

        for (int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num ++;
        }
        int total = 0;

        for (int num:arr) {
            total += num;
        }
        System.out.println(total);
    }
}
