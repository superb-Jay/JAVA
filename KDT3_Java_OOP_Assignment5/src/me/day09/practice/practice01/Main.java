package me.day09.practice.practice01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Electronics electronics = new Electronics(new Electronic[]{
                new Electronic("0001","",Electronic.Company.SAMSUNG, "220110", new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.FACE}),
                new Electronic("0002", "", Electronic.Company.LG, "211010", new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.PATTERN}),
                new Electronic("0003", "", Electronic.Company.APPLE, "220722", new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN}),
                new Electronic("0004", "", Electronic.Company.SAMSUNG, "220310", new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.FINGER}),
                new Electronic("0005", "", Electronic.Company.LG, "210722", new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.FINGER, Electronic.AuthMethod.PATTERN, AuthMethod.FACE}),
                new Electronic("0006", "", Electronic.Company.APPLE, "200310", new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.FINGER})});

        Electronic findResult = electronics.findByProductNo("0003");
        System.out.println(findResult);

        Electronics[] groupByResults = electronics.groupByCompanyName();
        System.out.println(Arrays.toString(groupByResults));
//         groupByResults[1]: LG
//         groupByResults[2]: APPLE
    }
}