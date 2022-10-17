package me.day09.practice.practice01;

import java.util.Arrays;
import java.util.Objects;

public class SmartTV extends NoneMobileElectronic{

    private int inch;

    public SmartTV(String productNo, String modelName, Company companyName, String dateOfMade, AuthMethod[] authMethod, String address, int inch) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, address);
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "inch=" + inch +
                ", address='" + address + '\'' +
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
        SmartTV smartTV = (SmartTV) o;
        return inch == smartTV.inch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inch);
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
