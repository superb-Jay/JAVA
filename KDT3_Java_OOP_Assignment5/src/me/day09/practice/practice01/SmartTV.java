package me.day09.practice.practice01;

import java.util.Arrays;
import java.util.Objects;

public class SmartTv extends NonMobileElectronic{

    private double inch;


    public SmartTv (String address, double inch){
        super(address);
        this.inch = inch;
    }
    public SmartTv(String productNo, String modelName, Company companyName, String dateOfMade, AuthMethod[] authMethod, String address, double inch) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, address);

        this.inch = inch;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "inch=" + inch +
                ", address='" + address + '\'' +
                ", productNo='" + productNo + '\'' +
                ", modelName='" + modelName + '\'' +
                ", companyName=" + companyName +
                ", dateOfMade='" + dateOfMade + '\'' +
                ", authMethod=" + Arrays.toString(authMethod) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartTv smartTv = (SmartTv) o;
        return Double.compare(smartTv.inch, inch) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inch);
    }

    @Override
    public void showElectronicInfo() {
        System.out.println("제품번호 :" + productNo);
        System.out.println("모델명 : " + modelName);
        System.out.println("회사명 : " + companyName);
        System.out.println("만든날짜 : " + dateOfMade);
        System.out.println("인증방식 : " + Arrays.toString(authMethod));
        System.out.println("주소 : " +address);
        System.out.println("인치 : " + inch + "인치");
    }
}