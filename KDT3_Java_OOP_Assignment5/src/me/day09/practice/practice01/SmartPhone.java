package me.day09.practice.practice01;

import java.util.Arrays;
import java.util.Objects;

public class SmartPhone extends MobileElectronic{

    private int numOfCameras;
    private int numOfSensors;

    public SmartPhone(String productNo, String modelName, Company companyName, String dateOfMade, AuthMethod[] authMethod, CommunicationMethod communicationMethod, double weight, int numOfCameras, int numOfSensors ) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, communicationMethod, weight);

        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public int getNumOfCameras() {
        return numOfCameras;
    }

    public void setNumOfCameras(int numOfCameras) {
        this.numOfCameras = numOfCameras;
    }

    public int getNumOfSensors() {
        return numOfSensors;
    }

    public void setNumOfSensors(int numOfSensors) {
        this.numOfSensors = numOfSensors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return numOfCameras == that.numOfCameras && numOfSensors == that.numOfSensors;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numOfCameras=" + numOfCameras +
                ", numOfSensors=" + numOfSensors +
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
        return Objects.hash(super.hashCode(), numOfCameras, numOfSensors);
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
        System.out.println("카메라 개수 : " + numOfCameras);
        System.out.println("센서 개수 : " + numOfSensors);
    }
}