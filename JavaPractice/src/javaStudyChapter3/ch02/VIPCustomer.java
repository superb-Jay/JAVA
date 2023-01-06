package javaStudyChapter3.ch02;

public class VIPCustomer extends Customer {

    private String agetID;
    double saleRatio;

    public String getAgetID() {
        return agetID;
    }

    public void setAgetID(String agetID) {
        this.agetID = agetID;
    }

    public VIPCustomer() {

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

}
