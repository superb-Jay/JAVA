package me.day09.practice.practice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

enum Company{SAMSUNG,LG,APPLE};
enum AuthMethod{FINGER,PATTERN,FIN,FACE};

public class Electronic {

    protected String productNo;
    protected String modelName;
    protected Company companyName;
    protected String dateOfMade;
    protected AuthMethod[] authMethod;

    public Electronic(){}
    public Electronic(String productNo, String modelName, Company companyName, String dateOfMade,AuthMethod[] authMethod){

        this.productNo = productNo;
        this.modelName = modelName;
        this.companyName = companyName;
        this.dateOfMade = dateOfMade;
        this.authMethod = authMethod;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
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

    public String getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(String dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public AuthMethod[] getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(AuthMethod[] authMethod) {
        this.authMethod = authMethod;
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
                ", dateOfMade='" + dateOfMade + '\'' +
                ", authMethod=" + Arrays.toString(authMethod) +
                '}';
    }

    public void showElectronicInfo(){
        System.out.println("제품번호 :" + productNo);
        System.out.println("모델명 : " + modelName);
        System.out.println("회사명 : " + companyName);
        System.out.println("만든날짜 : " + dateOfMade);
        if(productNo == null){
            System.out.println("인증방식 : " + Arrays.toString(authMethod));
        }
        else {
            System.out.print("인증방식 : ");
            for (int i = 0; i < authMethod.length; i++) {
                System.out.print(authMethod[i]);
                if (i < authMethod.length - 1) {
                    System.out.print(",");
                }
            }
        }
    }
}
