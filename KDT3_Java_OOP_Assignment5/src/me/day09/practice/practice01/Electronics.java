package me.day09.practice.practice01;

import java.util.Arrays;

public class Electronics {

    public static final int MAX_PRODUCT = 10;

    Electronic[] electronics = new Electronic[MAX_PRODUCT];

    public Electronics(Electronic[] electronics) {
        this.electronics = electronics;
    }

    public Electronic findByProductNo(String productNo) {
        int count = 0;
        for (int i = 0; i < electronics.length; i++) {
            if (electronics[i].getProductNo().equals(productNo)) {
                count = i;
            }
        }
        return electronics[count];
    }

    public Electronics[] groupByCompanyName() {

        Electronic[] groupByResults;
        Electronic[] sArray = new Electronic[10];
        Electronic[] lArray = new Electronic[10];
        Electronic[] aArray = new Electronic[10];

        for (int i = 0; i < electronics.length; i++) {
            if (electronics[i].getCompanyName().equals(Company.SAMSUNG)) {
                sArray[i] = electronics[i];
//                for (int j = 0; j < sArray.length; j++) {
//                    groupByResults[i] = sArray[i];
//                }
            } else if (electronics[i].getCompanyName().equals(Company.LG)) {
                lArray[i] = electronics[i];
            } else if (electronics[i].getCompanyName().equals(Company.APPLE)) {
                aArray[i] = electronics[i];
            }
        }


        return new Electronics[] {new Electronics(sArray), new Electronics(lArray), new Electronics(aArray)};

    }

    public Electronic[] getElectronics() {
        return this.electronics;
    }

    public void setElectronics(Electronic[] electronics) {
        this.electronics = electronics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronics that = (Electronics) o;
        return Arrays.equals(electronics, that.electronics);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(electronics);
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "electronics=" + Arrays.toString(electronics) +
                '}';
    }
}
