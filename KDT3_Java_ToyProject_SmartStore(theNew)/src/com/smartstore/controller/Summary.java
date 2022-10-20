package com.smartstore.controller;

import com.smartstore.model.vo.Column;
import com.smartstore.model.vo.Member;
import com.smartstore.model.vo.Parameter;

import javax.sound.midi.MetaMessage;
import java.util.Scanner;

public class Summary {

    Scanner in = new Scanner(System.in);

    Member[] members;
    Member[] oList = new Member[MemberController.getMemberCount()];
    Member[] gList = new Member[MemberController.getMemberCount()];
    Member[] vList = new Member[MemberController.getMemberCount()];
    Member[] vvList = new Member[MemberController.getMemberCount()];

    Summary[] summary = {new Summary(oList), new Summary(gList), new Summary(vList), new Summary(vvList)};
    Column[] columns = Column.values();
    int[] count = {columns[0].getNum(), columns[1].getNum(), columns[2].getNum(), columns[3].getNum()};

    public Summary() {
    }

    public Summary(Member[] members) {
        this.members = members;
    }

    public void summaryAll(Member[] members, Parameter[] parameters) {

        if (parameters[1] == null && parameters[2] == null && parameters[3] == null) {
            System.arraycopy(members, 0, oList, 0, MemberController.getMemberCount());
            count[0] = oList.length;
        }

        for (int i = parameters.length - 1; i > 0; i--) {
            if (parameters[i] == null) {

            } else {
                for (int j = 0; j < MemberController.getMemberCount(); j++) {
                    if (parameters[i].getSpentTime() < members[j].getSpentTime() && parameters[i].getTotalPay() < members[j].getSpentTime()) {
                        summary[i].members[count[i]] = members[j];
                        count[i]++;
                    } else {
                        oList[count[0]] = members[j];
                        count[0]++;
                    }
                }
            }
        }

        for (int i = 0; i < parameters.length; i++) {
            System.out.println("==============================");
            System.out.println(columns[i].getName() + " : " + count[i] + " customer(s)");
            if (parameters[i] == null) {
                System.out.println(columns[i].getName() + " Group : No parameters");
            } else {
                System.out.println(parameters[i].prameterShowInfo(i));
            }
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

    public void summarySortName(Member[] members, Parameter[] parameters) {

        String menu = "";
        do {
            System.out.println("** Press 'end', if you want to exit! **");
            System.out.println("Which order (ASCENDING, DESCENDING)?");
            menu = in.next().toUpperCase();
        } while (!(menu.equals("ASCENDING") || menu.equals("DESCENDING") || menu.equals("END")));

        switch (menu) {
            case "ASCENDING":
            case "DESCENDING":
                sortName(menu);
                break;
            case "END":
                return;
            default:
                System.out.println("Invalid Input. Please try again.");
                break;
        }
    }

    public void sortName(String menu) {



    }
}


