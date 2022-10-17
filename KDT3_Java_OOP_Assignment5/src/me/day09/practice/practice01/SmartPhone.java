package me.day09.practice.practice01;

import java.util.Arrays;
import java.util.Objects;

public class SmartPhone extends MobileElectronic{

    private int numOfCameras;
    private int numOfSensors;

    public SmartPhone(String productNo, String modelName, Company companyName, String dateOfMade, AuthMethod[] authMethod, CommunicationMethod communicationMethod, int weight, int numOfCameras, int numOfSensors) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, communicationMethod, weight);
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
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
                ", dateOfMade='" + dateOfMade + '\'' +
                ", authMethod=" + Arrays.toString(authMethod) +
                ", companyName=" + companyName +
                '}';
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
    public int hashCode() {
        return Objects.hash(super.hashCode(), numOfCameras, numOfSensors);
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
}
