package javaStudyChapter1to2.ch13;

public class Taxi {

    String taxiName;
    int money;
    int passengerCount;

    public Taxi(String taxiName) {
        this.taxiName = taxiName;
    }

    public void takeTaxi(int money) {
        this.money += money;
        passengerCount ++;
    }

    public void taxiShowInfo() {
        System.out.println(taxiName + "수입은 " + money + "원 입니다.");
    }

}
