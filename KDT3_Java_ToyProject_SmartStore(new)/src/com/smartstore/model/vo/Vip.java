package com.smartstore.model.vo;

public class Vip {

    int vipSpentTime = 0;
    int vipTotalPay = 0;

    public int getVipSpentTime() {
        return vipSpentTime;
    }

    public void setVipSpentTime(int vipSpentTime) {
        this.vipSpentTime = vipSpentTime;
    }

    public int getVipTotalPay() {
        return vipTotalPay;
    }

    public void setVipTotalPay(int vipTotalPay) {
        this.vipTotalPay = vipTotalPay;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "vipSpentTime=" + vipSpentTime +
                ", vipTotalPay=" + vipTotalPay +
                '}';
    }

    public void showInfo() {
        System.out.println(toString());
    }
}
