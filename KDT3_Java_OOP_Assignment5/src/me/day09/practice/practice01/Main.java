package me.day09.practice.practice01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Electronics electronics = new Electronics(new Electronic[]{
                new Electronic("0001", "", Company.SAMSUNG, "220110", new AuthMethod[]{AuthMethod.FIN, AuthMethod.FACE}),
                new Electronic("0002", "", Company.LG, "211010", new AuthMethod[]{AuthMethod.FIN, AuthMethod.PATTERN}),
                new Electronic("0003", "", Company.APPLE, "220722", new AuthMethod[]{AuthMethod.FIN}),
                new Electronic("0004", "", Company.SAMSUNG, "220310", new AuthMethod[]{AuthMethod.FIN, AuthMethod.FINGER}),
                new Electronic("0005", "", Company.LG, "210722", new AuthMethod[]{AuthMethod.FIN, AuthMethod.FINGER, AuthMethod.PATTERN, AuthMethod.FACE}),
                new Electronic("0006", "", Company.APPLE, "200310", new AuthMethod[]{AuthMethod.FIN, AuthMethod.FINGER})});

        System.out.println("===============실습2번 출력========================");
        electronics.findByProductNo("0003").showElectronicInfo();
        System.out.println("\n");


        Electronics[] groupByResults = electronics.groupByCompanyName();
        System.out.println("===============실습3번 출력========================");
        for (Electronics groupByResult : groupByResults) {
            System.out.println(groupByResult);
        }

        Member member = new Member("a", "a1234", "010-1234-5678", "a@gmail.com", "991201");

        final int CANDIDATES = 10;
        String[] candidates = new String[CANDIDATES];

        for (int i = 0; i < CANDIDATES; i++) {
            candidates[i] = randomPhoneNumber();
        }
        System.out.println();
        System.out.println("===============실습4번 출력========================");
        String newPhoneNumber = member.getNewPhoneNumber(candidates);
        System.out.println("newPhoneNumber = " + newPhoneNumber);

        member.showMemberInfo();
    }

    private static String randomPhoneNumber() {
        String random = "010";

        for(int i = 0; i < 2; i++) {
            random += "-";
            for(int j = 0; j < 4; j++) {
                int digit = (int)(Math.random() * 10); // 0 ~ 9
                random += digit;
            }
        }
        return random;
    }
}