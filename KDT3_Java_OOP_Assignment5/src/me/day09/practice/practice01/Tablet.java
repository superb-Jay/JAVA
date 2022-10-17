package me.day09.practice.practice01;

import java.util.Arrays;
import java.util.Objects;

public class Tablet extends MobileElectronic{

    private boolean hasPencil;

    public Tablet(String productNo, String modelName, Company companyName, String dateOfMade, AuthMethod[] authMethod, CommunicationMethod communicationMethod, double weight, boolean hasPencil) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, communicationMethod, weight);

        this.hasPencil = hasPencil;
    }

    public boolean isHasPencil() {
        return hasPencil;
    }

    public void setHasPencil(boolean hasPencil) {
        this.hasPencil = hasPencil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tablet tablet = (Tablet) o;
        return hasPencil == tablet.hasPencil;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "hasPencil=" + hasPencil +
                ", communicationMethod=" + communicationMethod +
                ", weight=" + weight +
                ", productNo='" + productNo + '\'' +
                ", modelName='" + modelName + '\'' +
                ", companyName=" + companyName +
                ", dateOfMade='" + dateOfMade + '\'' +
                ", authMethod=" + Arrays.toString(authMethod) +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasPencil);
    }

    @Override
    public void showElectronicInfo() {
        System.out.println("제품번호 :" + productNo);
        System.out.println("모델명 : " + modelName);
        System.out.println("회사명 : " + companyName);
        System.out.println("만든날짜 : " + dateOfMade);
        System.out.print("인증방식 : ");
        for (int i = 0; i < authMethod.length; i++){
            System.out.print(authMethod[i]);
            if(i < authMethod.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("퉁신방법 : " + communicationMethod);
        System.out.println("무게 : " + weight + "g");
        if(hasPencil){
            System.out.println("펜슬 있음");
        }
        else {
            System.out.println("펜슬 없음");
        }
    }
}