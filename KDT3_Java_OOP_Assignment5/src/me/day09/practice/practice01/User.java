package me.day09.practice.practice01;

import java.util.Objects;

public class User {
    protected Member memberInfo;
    protected String electronicDevice;
    protected String paymentPolicy;

    public User(Member memberInfo, String electronicDevice, String paymentPolicy) {
        this.memberInfo = memberInfo;
        this.electronicDevice = electronicDevice;
        this.paymentPolicy = paymentPolicy;
    } // 유저는 모든 필드를 가져야만 생성이 가능하다는 이야기.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return memberInfo.equals(user.memberInfo) && electronicDevice.equals(user.electronicDevice) && paymentPolicy.equals(user.paymentPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberInfo, electronicDevice, paymentPolicy);
    }

    @Override
    public String toString() {
        return "User{" +
                "memberInfo=" + memberInfo +
                ", electronicDevice='" + electronicDevice + '\'' +
                ", paymentPolicy='" + paymentPolicy + '\'' +
                '}';
    }

    public Member getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(Member memberInfo) {
        this.memberInfo = memberInfo;
    }

    public String getElectronicDevice() {
        return electronicDevice;
    }

    public void setElectronicDevice(String electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }
}
