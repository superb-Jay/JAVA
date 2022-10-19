package com.smartstore.model.vo;

public enum Column {
    GENERAL(0,"GENERAL"), VIP(1,"VIP"), VVIP(2,"VVIP"), OTHERS(3,"OTHERES");

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
