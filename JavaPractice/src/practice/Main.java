package practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String data = br.readLine();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] array = new Integer[N];
        for (int i = 0; i < N ; i++) {
            array[i] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(array);

        int answer = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <= i ; j++) {
                answer += array[j];
            }
        }
        System.out.println(answer);
    }
}