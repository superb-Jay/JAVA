package me.day06.practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {

        int[][] scores2d = {
                {50, 60, 70},
                {60, 76, 100},
                {95, 88, 87},
                {60, 65, 85},
                {100, 85, 77}
        };
        System.out.println("================학생별 평균 출력================");

        double[] arrayAvg = new double[scores2d.length];
        int[] sortedIndex = new int[scores2d.length];
        for (int i = 0; i < sortedIndex.length; i++) {
            sortedIndex[i] = i;
        }


        for (int i = 0; i < scores2d.length; i++) {

            int sum = 0;
            int count = 0;
            double avg = 0;

            for (int j = 0; j < scores2d[j].length; j++) {
                sum += scores2d[i][j];
                count++;
            }
            avg = (double) sum / count;
            System.out.println(i + 1 + "번학생의 평균은? " + avg);
            arrayAvg[i] = avg;
        }

        System.out.println("============학생별 평균 오름차순 출력============");
        for (int i = 0; i < arrayAvg.length; i++) {
            for (int j = i+1; j < arrayAvg.length ; j++) {
                if(arrayAvg[i] > arrayAvg[j]){
                    double temp;
                    temp = arrayAvg[i];
                    arrayAvg[i] = arrayAvg[j];
                    arrayAvg[j] = temp;

                    int tmp;
                    tmp = sortedIndex[i];
                    sortedIndex[i] = sortedIndex[j];
                    sortedIndex[j] = tmp;


                }
            }
        }

        for (int i = 0; i < arrayAvg.length; i++) {
            System.out.println(sortedIndex[i]+1 +"번 학생의 평균은? "+ arrayAvg[i] );
        }

        System.out.println("================과목별 평균 출력================");

        double[] arraySubjectAvg = new double[scores2d[0].length];
        int[] sortedSIndex = new int[scores2d.length];
        String[] subject = {"국어성적","수학성적","영어성적"};

        for (int i = 0; i < scores2d[i].length; i++) {

            int sum = 0;
            int count = 0;
            double avg = 0;

            for (int j = 0; j < scores2d.length; j++) {
                sum += scores2d[j][i];
                count++;
            }
            avg = (double)sum / count;
            System.out.println(subject[i]+"의 평균은 " + avg);
            arraySubjectAvg[i] = avg;
        }
        System.out.println("============과목별 평균 내림차순 출력============");

        for (int i = 0; i < arraySubjectAvg.length; i++) {
            for (int j = i+1; j < arraySubjectAvg.length ; j++) {
                if(arraySubjectAvg[i] < arraySubjectAvg[j]){
                    double temp;
                    temp = arraySubjectAvg[i];
                    arraySubjectAvg[i] = arraySubjectAvg[j];
                    arraySubjectAvg[j] = temp;

                    String tmp;
                    tmp = subject[i];
                    subject[i] = subject[j];
                    subject[j] = tmp;


                }
            }
        }
        for (int i = 0; i < arraySubjectAvg.length; i++) {
            System.out.println(subject[i] +"번 학생의 평균은? "+ arraySubjectAvg[i] );
        }


        System.out.println("=============================================");
    }
}
