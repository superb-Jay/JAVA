package com.smartstore.model.vo;

import com.smartstore.controller.MemberController;

import java.util.Objects;

public class Member {
    private String customerName;
    private String customerId;
    private int spentTime;
    private int totalPay;
    Member[] members;

    MemberController mc = new MemberController();
    private int customerNumber = mc.getMemberCount()+1;

    public Member() {

    }

    public Member(Member[] members) {
        this.members = members;
    }

    public Member(String customerName, String customerId, int spentTime, int totalPay) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.spentTime = spentTime;
        this.totalPay = totalPay;
    }

    @Override
    public String toString() {
        return "Member{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", getCustomerId='" + customerId + '\'' +
                ", spentTime=" + spentTime +
                ", totalPay=" + totalPay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return customerNumber == member.customerNumber && spentTime == member.spentTime && totalPay == member.totalPay && customerName.equals(member.customerName) && customerId.equals(member.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerNumber, customerName, customerId, spentTime, totalPay);
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getCustormerName() {
        return customerName;
    }

    public void setCustormerName(String custormerName) {
        this.customerName = custormerName;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
