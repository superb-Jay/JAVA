package practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();

        if(Integer.parseInt(data)<10) {
            data="0"+data;
        }
        String answers = data;
        int count = 0;

        do {
            String[] datas = data.split("");
            String sum = String.valueOf(Integer.parseInt(datas[0]) + Integer.parseInt(datas[datas.length - 1]));
            if(Integer.parseInt(sum) >= 10) {
                sum = String.valueOf(Integer.parseInt(sum)%10);
            }
            data = datas[datas.length - 1] + sum;
            count++;
        }
        while (!(answers.equals(data)));
        System.out.println(count);
    }
}