package me.day09.practice.practice01;

import java.util.Arrays;
import java.util.Objects;

public class NonMobileElectronic extends Electronic{

    protected String address;

    public NonMobileElectronic(String address){
        this.address = address;
    }
    public NonMobileElectronic(String productNo, String modelName, Company companyName, String dateOfMade, AuthMethod[] authMethod,String address) {
        super(productNo, modelName, companyName, dateOfMade, authMethod);

        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NonMobileElectronic{" +
                "address='" + address + '\'' +
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
        NonMobileElectronic that = (NonMobileElectronic) o;
        return address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), address);
    }

    @Override
    public void showElectronicInfo() {
        System.out.println("제품번호 :" + productNo);
        System.out.println("모델명 : " + modelName);
        System.out.println("회사명 : " + companyName);
        System.out.println("만든날짜 : " + dateOfMade);
        System.out.println("인증방식 : " + Arrays.toString(authMethod));
        System.out.println("주소 : " +address);
    }
}