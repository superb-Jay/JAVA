package javaStudyChapter3.ch03;

public class VIPCustomer extends Customer {

    private String agetID;
    double saleRatio;

    public VIPCustomer(int cutomerID, String customerName) {
        super(cutomerID, customerName);
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer(int, String) call");
    }


//    public VIPCustomer() {
//
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//        customerGrade = "VIP";
//        System.out.println("VIPCustomer() call");
//    }

    public String getAgetID() {
        return agetID;
    }

    public void setAgetID(String agetID) {
        this.agetID = agetID;
    }


}
