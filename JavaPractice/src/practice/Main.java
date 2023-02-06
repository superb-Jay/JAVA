package practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String data = br.readLine();
        int prData = Integer.parseInt(data);

        if((prData%4 == 0 && prData%100 != 0)||prData%400 == 0) {
            sb.append(1);
        }else{
            sb.append(0);
        }

        System.out.println(sb);
    }
}