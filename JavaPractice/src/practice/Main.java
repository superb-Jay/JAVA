package practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int data = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int hNumber = Integer.parseInt(st.nextToken());
        int mNumber = Integer.parseInt(st.nextToken());

        if(mNumber >= 45) {
            sb.append(hNumber + " ");
            sb.append(mNumber - 45);
        }else if (hNumber > 0 && mNumber < 45) {
            sb.append(hNumber - 1+ " ");
            sb.append(mNumber + 15);
        }else {
            hNumber = 23;
            sb.append(hNumber+ " ");
            sb.append(mNumber+15);
        }
        System.out.println(sb);
    }
}