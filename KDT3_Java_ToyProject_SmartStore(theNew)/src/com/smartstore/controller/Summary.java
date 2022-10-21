package com.smartstore.controller;

import com.smartstore.model.vo.Column;
import com.smartstore.model.vo.Member;
import com.smartstore.model.vo.Parameter;

import java.util.Scanner;

public class Summary {

    Scanner in = new Scanner(System.in);

    Member[] members;
    Column[] columns = Column.values();
    int count;


    public Summary() {
    }

    public Summary(Member[] members, int count) {
        this.members = members;
        this.count = count;
    }

    public Summary[] summaryAll(Member[] members, Parameter[] parameters) {

        Member[] oList = new Member[MemberController.getMemberCount()];
        Member[] gList = new Member[MemberController.getMemberCount()];
        Member[] vList = new Member[MemberController.getMemberCount()];
        Member[] vvList = new Member[MemberController.getMemberCount()];

        int oCount = 0;
        int gCount = 0;
        int vCount = 0;
        int vvCount = 0;

        if ((parameters[1] == null) && (parameters[2] == null) && (parameters[3] == null)) {
            System.arraycopy(members, 0, oList, 0, MemberController.getMemberCount());
            oCount = oList.length;
            Summary[] summary = {new Summary(oList,oCount), new Summary(gList,gCount), new Summary(vList,vCount), new Summary(vvList,vvCount)};
            return summary;
        }

        for (int i = 0; i < MemberController.getMemberCount(); i++) {
            if (parameters[3] != null && parameters[3].getSpentTime() < members[i].getSpentTime() && parameters[3].getTotalPay() < members[i].getSpentTime()) {
                vvList[vvCount] = members[i];
                vvCount++;
            } else if (parameters[2] != null && parameters[2].getSpentTime() < members[i].getSpentTime() && parameters[2].getTotalPay() < members[i].getSpentTime()) {
                vList[vCount] = members[i];
                vCount++;
            } else if (parameters[1] != null && parameters[1].getSpentTime() < members[i].getSpentTime() && parameters[1].getTotalPay() < members[i].getSpentTime()) {
                gList[gCount] = members[i];
                gCount++;
            } else {
                oList[oCount] = members[i];
                oCount++;
            }
        }
        return new Summary[]{new Summary(oList,oCount), new Summary(gList,gCount), new Summary(vList,vCount), new Summary(vvList,vvCount)};
    }

    public void viewSummary(Parameter[] parameters, Summary[] summary) {

        for (int i = 0; i < parameters.length; i++) {
            System.out.println("==============================");
            System.out.println(columns[i].getName() + " : " + summary[i].count + " customer(s)");
            if (parameters[i] == null) {
                System.out.println(columns[i].getName() + " Group : No parameters");
            } else {
                System.out.println(parameters[i].prameterShowInfo(i));
            }
            System.out.println("------------------------------");
            if (summary[i].count == 0) {
                System.out.println("No customer.");
            } else {
                for (int j = 0; j < summary[i].count; j++) {
                    System.out.println("NO. " + (j + 1) + " => " + columns[i].getName()+" "+ summary[i].members[j].toString());
                }
            }
        }
    }

    public void summarySort(Parameter[] parameter, Summary[] summary, int menuNum) {

        Summary[] returnSummaray;
        String menu = "";
        do {
            System.out.println("** Press 'end', if you want to exit! **");
            System.out.println("Which order (ASCENDING, DESCENDING)?");
            menu = in.next().toUpperCase();
        } while (!(menu.equals("ASCENDING") || menu.equals("DESCENDING") || menu.equals("END")));
        if (menu.equals("END")) {
            return;
        }

        switch (menuNum) {
            case 2:
                returnSummaray = sortName(menu, summary);
                viewSummary(parameter, returnSummaray);
                break;

            case 3:
                returnSummaray = sortTime(menu, summary);
                viewSummary(parameter, returnSummaray);
                break;

            case 4:
                returnSummaray = sortPayment(menu, summary);
                viewSummary(parameter, returnSummaray);
                break;
        }
    }

    public Summary[] sortName(String menu, Summary[] summary) {
        Summary[] copy = new Summary[summary.length];
        System.arraycopy(summary, 0, copy, 0, summary.length);

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].members.length; j++) {
                if (copy[i].members[j].getCustormerName() == null) {
                    return copy;
                }
            }
        }

        if (menu.equals("ASCENDING")) {

            for (int i = 0; i < copy.length; i++) {
                if (summary[i].count == 0) {

                } else {
                    for (int j = 0; j < summary[i].count; j++) {
                        for (int k = 0; k < j; k++) {
                            if (copy[i].members[k].getCustormerName() == null) {
                            } else {
                                if (copy[i].members[j].getCustormerName().compareTo(copy[i].members[k].getCustormerName()) < 0) {
                                    Member temp = copy[i].members[j];
                                    copy[i].members[j] = copy[i].members[k];
                                    copy[i].members[k] = temp;
                                }
                            }
                        }
                    }
                }
            }

        } else if (menu.equals("DESCENDING")) {
            for (int i = 0; i < copy.length; i++) {
                if (summary[i].count == 0) {

                } else {
                    for (int j = 0; j < summary[i].count; j++) {
                        for (int k = 0; k < j; k++) {
                            if (copy[i].members[k].getCustormerName() == null) {
                            } else {
                                if (copy[i].members[j].getCustormerName().compareTo(copy[i].members[k].getCustormerName()) > 0) {
                                    Member temp = copy[i].members[j];
                                    copy[i].members[j] = copy[i].members[k];
                                    copy[i].members[k] = temp;
                                }
                            }
                        }
                    }
                }
            }
        }
        return copy;
    }

    public Summary[] sortTime(String menu, Summary[] summary) {
        Summary[] copy = new Summary[summary.length];
        System.arraycopy(summary, 0, copy, 0, summary.length);

        if (menu.equals("ASCENDING")) {

            for (int i = 0; i < copy.length; i++) {
                if (summary[i].count == 0) {

                } else {
                    for (int j = 0; j < summary[i].count; j++) {
                        for (int k = 0; k < j; k++) {
                            if (copy[i].members[k].getSpentTime() == 0) {
                            } else {
                                if (copy[i].members[j].getSpentTime() < copy[i].members[k].getSpentTime()) {
                                    Member temp = copy[i].members[j];
                                    copy[i].members[j] = copy[i].members[k];
                                    copy[i].members[k] = temp;
                                }
                            }
                        }
                    }
                }
            }

        } else if (menu.equals("DESCENDING")) {
            for (int i = 0; i < copy.length; i++) {
                if (summary[i].count == 0) {

                } else {
                    for (int j = 0; j < summary[i].count; j++) {
                        for (int k = 0; k < j; k++) {
                            if (copy[i].members[k].getSpentTime() == 0) {
                            } else {
                                if (copy[i].members[j].getSpentTime() > copy[i].members[k].getSpentTime()) {
                                    Member temp = copy[i].members[j];
                                    copy[i].members[j] = copy[i].members[k];
                                    copy[i].members[k] = temp;
                                }
                            }
                        }
                    }
                }
            }
        }
        return copy;
    }

    public Summary[] sortPayment(String menu, Summary[] summary) {
        Summary[] copy = new Summary[summary.length];
        System.arraycopy(summary, 0, copy, 0, summary.length);

        if (menu.equals("ASCENDING")) {

            for (int i = 0; i < copy.length; i++) {
                if (summary[i].count == 0) {

                } else {
                    for (int j = 0; j < summary[i].count; j++) {
                        for (int k = 0; k < j; k++) {
                            if (copy[i].members[k].getTotalPay() == 0) {
                            } else {
                                if (copy[i].members[j].getTotalPay() < copy[i].members[k].getTotalPay()) {
                                    Member temp = copy[i].members[j];
                                    copy[i].members[j] = copy[i].members[k];
                                    copy[i].members[k] = temp;
                                }
                            }
                        }
                    }
                }
            }

        } else if (menu.equals("DESCENDING")) {
            for (int i = 0; i < copy.length; i++) {
                if (summary[i].count == 0) {

                } else {
                    for (int j = 0; j < summary[i].count; j++) {
                        for (int k = 0; k < j; k++) {
                            if (copy[i].members[k].getTotalPay() == 0) {
                            } else {
                                if (copy[i].members[j].getTotalPay() > copy[i].members[k].getTotalPay()) {
                                    Member temp = copy[i].members[j];
                                    copy[i].members[j] = copy[i].members[k];
                                    copy[i].members[k] = temp;
                                }
                            }
                        }
                    }
                }
            }
        }
        return copy;
    }
}


