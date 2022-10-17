package javaStudyChapter1to2.ch22;

public class TwoDimensionTest {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {1, 2, 3, 4}};

        for (int i = 0; i < arr.length; i++) { // 2차원배열의 i는 행, j는 열
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + ",");

            }
            System.out.println("\t" + arr[i].length);
        }

    }
}
