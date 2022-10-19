package com.smartstore.model.vo;

public class Parameter {

    private int SpentTime = 0;
    private int TotalPay = 0;

    public Parameter(int spentTime, int totalPay) {
        SpentTime = spentTime;
        TotalPay = totalPay;
    }

    public int getSpentTime() {
        return SpentTime;
    }

    public void setSpentTime(int SpentTime) {
        this.SpentTime = SpentTime;
    }

    public int getTotalPay() {
        return TotalPay;
    }

    public void setTotalPay(int pTotalPay) {
        this.TotalPay = TotalPay;
    }

    public String prameterShowInfo(int num) {
        return Column.values()[num] +" Parameter {"+
                "SpentTime=" + SpentTime +
                ", TotalPay=" + TotalPay +
                '}';
    }
}
