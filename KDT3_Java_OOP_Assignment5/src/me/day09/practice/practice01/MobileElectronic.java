package me.day09.practice.practice01;

import java.util.Arrays;
import java.util.Objects;

enum CommunicationMethod {FIVE_G,FOUR_G,THREE_G}

public class MobileElectronic extends Electronic {
    @Override
    public String toString() {
        return "MobileElectronic{" +
                "communicationMethod=" + communicationMethod +
                ", weight=" + weight +
                ", productNo='" + productNo + '\'' +
                ", modelName='" + modelName + '\'' +
                ", companyName=" + companyName +
                ", dateOfMade='" + dateOfMade + '\'' +
                ", authMethod=" + Arrays.toString(authMethod) +
                '}';
    }

    protected CommunicationMethod communicationMethod;
    protected double weight;

    public MobileElectronic(String productNo, String modelName, Company companyName, String dateOfMade, AuthMethod[] authMethod,CommunicationMethod communicationMethod,double weight) {
        super(productNo, modelName, companyName, dateOfMade, authMethod);

        this.communicationMethod = communicationMethod;
        this.weight = weight;
    }

    public CommunicationMethod getCommunicationMethod() {
        return communicationMethod;
    }

    public void setCommunicationMethod(CommunicationMethod communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MobileElectronic that = (MobileElectronic) o;
        return Double.compare(that.weight, weight) == 0 && communicationMethod == that.communicationMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), communicationMethod, weight);
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
    }
}