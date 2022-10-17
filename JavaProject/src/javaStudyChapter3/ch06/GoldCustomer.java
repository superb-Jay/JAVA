package javaStudyChapter3.ch06;

public class GoldCustomer extends Customer {

    double saleRatio;

    public GoldCustomer(int cutomerID, String customerName) {
        super(cutomerID, customerName);
        saleRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * saleRatio);
        return price;
    }
}
