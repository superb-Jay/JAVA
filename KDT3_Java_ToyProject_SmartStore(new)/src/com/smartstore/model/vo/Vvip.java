package com.smartstore.model.vo;

public class Vvip {

    int vVipSpentTime;
    int vVipTotalPay;

    public int getvVipSpentTime() {
        return vVipSpentTime;
    }

    public void setvVipSpentTime(int vVipSpentTime) {
        this.vVipSpentTime = vVipSpentTime;
    }

    public int getvVipTotalPay() {
        return vVipTotalPay;
    }

    public void setvVipTotalPay(int vVipTotalPay) {
        this.vVipTotalPay = vVipTotalPay;
    }

    @Override
    public String toString() {
        return "Vvip{" +
                "vVipSpentTime=" + vVipSpentTime +
                ", vVipTotalPay=" + vVipTotalPay +
                '}';
    }

    public void showInfo() {
        System.out.println(toString());
    }
}
