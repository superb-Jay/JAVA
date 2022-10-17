package javaStudyChapter3.ch04;

public class VIPCustomer extends Customer {

    private String agetID;
    double saleRatio;

    public VIPCustomer(int cutomerID, String customerName) {
        super(cutomerID, customerName);
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        price -= (int)(price * saleRatio);
        return price ;
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
