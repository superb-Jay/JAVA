package me.day09.practice.practice01;

import java.util.ArrayList;
import java.util.Arrays;

public class Electronics {

    private Electronic[] electronics;

    public Electronics() {}

    public Electronics(int size) {
        electronics = new Electronic[size];
    }
    public Electronics(Electronic[] electronics){
        this.electronics = electronics;
    }

    public Electronic[] getElectronics() {
        return electronics;
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

    public Electronic[] getElectronics(int size) {
//        Electronic[] result = new Electronic[size];
//        for (int i = 0; i < size; i++) {
//            result[i] = electronics[i];
//        }

        Electronic[] result = Arrays.copyOf(electronics, size);
        return result;
    }


    public void setElectronics(Electronic[] electronics) {
        this.electronics = electronics;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "electronics=" + Arrays.toString(electronics) +
                '}';
    }

    public Electronic findByProductNo(String productNo){  //실습 2번
        Electronic search = new Electronic();
        for(int i = 0;i < electronics.length; i++){
            if(electronics[i].getProductNo().equals(productNo)){
                search = electronics[i];
            }
        }
        return search;
    }
    public Electronics[] groupByCompanyName(){ // 실습3번
        Electronics s = new Electronics(electronics.length);
        Electronics l = new Electronics(electronics.length);
        Electronics a = new Electronics(electronics.length);

        int sIdx = 0;
        int lIdx = 0;
        int aIdx = 0;

        for(int i = 0; i < electronics.length; i++){
            Company companies = electronics[i].getCompanyName();

            if (companies == Company.SAMSUNG) {
                s.getElectronics()[sIdx] = electronics[i];
                sIdx++;
            } else if (companies == Company.LG) {
                l.getElectronics()[lIdx] = electronics[i];
                lIdx++;
            }else{
                a.getElectronics()[aIdx] = electronics[i];
                aIdx++;
            }
        }
//        System.out.println(Arrays.toString(s.getElectronics(sIdx)));
//        System.out.println(Arrays.toString(l.getElectronics(lIdx)));
//        System.out.println(Arrays.toString(a.getElectronics(aIdx)));
        return  new Electronics[] {new Electronics(s.getElectronics(sIdx)), new Electronics(l.getElectronics(lIdx)),
                new Electronics(a.getElectronics(aIdx))};
    }
}