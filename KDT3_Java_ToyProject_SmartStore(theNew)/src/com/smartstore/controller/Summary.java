package com.smartstore.controller;

import com.smartstore.model.vo.Column;
import com.smartstore.model.vo.Member;
import com.smartstore.model.vo.Parameter;

import javax.sound.midi.MetaMessage;

public class Summary {

    Member[] members;

    public Summary() {
    }

    public Summary(Member[] members) {
        this.members = members;
    }

    public void summaryAll(Member[] members, Parameter[] parameters) {

        Member[] oList = new Member[MemberController.getMemberCount()];
        Member[] gList = new Member[MemberController.getMemberCount()];
        Member[] vList = new Member[MemberController.getMemberCount()];
        Member[] vvList = new Member[MemberController.getMemberCount()];

        int vvCount = 0;
        int vCount = 0;
        int gCount = 0;
        int oCount = 0;


        for (int i = 0; i < MemberController.getMemberCount(); i++) {
            if (parameters[1] != null) {
                if (parameters[1].getSpentTime() < members[i].getSpentTime() && parameters[1].getTotalPay() < members[i].getSpentTime()) {
                    gList[gCount] = members[i];
                    gCount++;
                }
            } else if (parameters[2] != null) {

                if (parameters[2].getSpentTime() < members[i].getSpentTime() && parameters[2].getTotalPay() < members[i].getSpentTime()) {
                    vList[vCount] = members[i];
                    vCount++;
                }

            } else if (parameters[3] != null) {
                if (parameters[3].getSpentTime() < members[i].getSpentTime() && parameters[3].getTotalPay() < members[i].getSpentTime()) {
                    vvList[vvCount] = members[i];
                    vvCount++;
                }
            } else {
                oList[oCount] = members[i];
                oCount++;
            }
        }


        Column[] columns = Column.values();

        Summary sO = new Summary();
        Summary sG = new Summary();
        Summary sV = new Summary();
        Summary sVv = new Summary();
        Summary[] summary = {sO, sG, sV, sVv};
        int[] count = {oCount, gCount, vCount, vvCount};
        sO.members = oList;
        sG.members = gList;
        sV.members = vList;
        sVv.members = vvList;

        for (int i = 0; i < parameters.length; i++) {
            System.out.println("==============================");
            System.out.println(columns[i].getName() + ": " + count[i] + " customer(s)");
            System.out.println("------------------------------");
            if (count[i] == 0) {
                System.out.println("No customer.");
            } else {
                for (int j = 0; j < count[i]; j++) {
                    System.out.println("NO. " + (j + 1) + " => " + summary[i].members[j].toString());
                }
            }
        }
    }
}


