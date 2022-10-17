package me.day09.practice.practice01;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class NoneMobileElectronic extends Electronic{

    protected String address;

    public NoneMobileElectronic(String address) {
        this.address = address;
    }

    public NoneMobileElectronic(String productNo, String modelName, Company companyName, LocalDate dateOfMade, AuthMethod[] authMethod, String address) {
        super(productNo, modelName, companyName, dateOfMade, authMethod);
        this.address = address;
    }

    @Override
    public String toString() {
        return "NoneMobileElectronic{" +
                "address='" + address + '\'' +
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
        NoneMobileElectronic that = (NoneMobileElectronic) o;
        return address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
