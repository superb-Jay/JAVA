package com.smartstore.model.vo;

public enum Column {
    OTHERS(0,"OTHERES") ,GENERAL(1,"GENERAL"), VIP(2,"VIP"), VVIP(3,"VVIP");

    private int num;
    private String name;

    Column(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
