package me.day09.practice.practice01;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Electronic {

    public enum Company {SAMSUNG, LG, APPLE}
    public enum AuthMethod {PIN, FINGER, PATTERN, FACE}

    protected String productNo; // auto-generated
    protected String modelName;
    protected Company companyName;
    protected LocalDate dateOfMade;
    protected AuthMethod[] authMethod;
    private static int count = 0;

    public Electronic() {
    }
    public Electronic(String productNo, String modelName, Company companyName, LocalDate dateOfMade, AuthMethod[] authMethod) {
        this.productNo = productNo;
        this.modelName = modelName;
        this.companyName = companyName;
        this.dateOfMade = dateOfMade;
        this.authMethod = authMethod;
        generateKey();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronic that = (Electronic) o;
        return productNo.equals(that.productNo) && modelName.equals(that.modelName) && companyName == that.companyName && dateOfMade.equals(that.dateOfMade) && Arrays.equals(authMethod, that.authMethod);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(productNo, modelName, companyName, dateOfMade);
        result = 31 * result + Arrays.hashCode(authMethod);
        return result;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "productNo='" + productNo + '\'' +
                ", modelName='" + modelName + '\'' +
                ", companyName=" + companyName +
                ", dateOfMade=" + dateOfMade +
                ", authMethod=" + Arrays.toString(authMethod) +
                '}';
    }

    private void generateKey() {
        count++;
        productNo = String.format("%05d",count);
    }

    public String getProductNo() {
        return productNo;
    }

    private void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Company getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Company companyName) {
        this.companyName = companyName;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public AuthMethod[] getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(AuthMethod[] authMethod) {
        this.authMethod = authMethod;
    }
}


