package com.smartstore.model.vo;

import java.sql.Time;

public class General {

    int generalSpentTime ;
    int generalTotalPay ;

    public int getGeneralSpentTime() {
        return generalSpentTime;
    }

    public void setGeneralSpentTime(int generalSpentTime) {
        this.generalSpentTime = generalSpentTime;
    }

    public int getGeneralTotalPay() {
        return generalTotalPay;
    }

    public void setGeneralTotalPay(int generalTotalPay) {
        this.generalTotalPay = generalTotalPay;
    }

    @Override
    public String toString() {
        return "General{" +
                "generalSpentTime=" + generalSpentTime +
                ", generalTotalPay=" + generalTotalPay +
                '}';
    }

    public void showInfo() {
        System.out.println(toString());
    }
}
