package me.day09.practice.practice01;

import java.util.Arrays;
import java.util.Objects;

public class Tablet extends MobileElectronic{
    private boolean hasPencil;

    public Tablet(String productNo, String modelName, Company companyName, String dateOfMade, AuthMethod[] authMethod, CommunicationMethod communicationMethod, int weight, boolean hasPencil) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, communicationMethod, weight);
        this.hasPencil = hasPencil;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "hasPencil=" + hasPencil +
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
        Tablet tablet = (Tablet) o;
        return hasPencil == tablet.hasPencil;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasPencil);
    }

    public boolean isHasPencil() {
        return hasPencil;
    }

    public void setHasPencil(boolean hasPencil) {
        this.hasPencil = hasPencil;
    }
}
