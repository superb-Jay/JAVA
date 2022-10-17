package me.day09.practice.practice01;

import java.util.Objects;

public class User {

    private Member member;
    private Electronic electronicDevice;
    private String paymentPolicy;

    public User(Member member, Electronic electronicDevice, String paymentPolicy){

        this.member = member;
        this.electronicDevice = electronicDevice;
        this.paymentPolicy = paymentPolicy;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Electronic getElectronicDevice() {
        return electronicDevice;
    }

    public void setElectronicDevice(Electronic electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return member.equals(user.member) && electronicDevice.equals(user.electronicDevice) && paymentPolicy.equals(user.paymentPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, electronicDevice, paymentPolicy);
    }

    @Override
    public String toString() {
        return "User{" +
                "member=" + member +
                ", electronicDevice=" + electronicDevice +
                ", paymentPolicy='" + paymentPolicy + '\'' +
                '}';
    }

}