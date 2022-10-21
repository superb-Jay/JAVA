package com.smartstore.controller;

import com.smartstore.model.vo.Column;
import com.smartstore.model.vo.Member;
import com.smartstore.model.vo.Parameter;

import java.util.Scanner;

public class Summary {

    Scanner in = new Scanner(System.in);

    Member[] members;
    Column[] columns = Column.values();
    int[] count = new int[4];

    public Summary() {
    }

    public Summary(Member[] members) {
        this.members = members;
    }

    public Summary[] summaryAll(Member[] members, Parameter[] parameters) {

        Member[] oList = new Member[MemberController.getMemberCount()];
        Member[] gList = new Member[MemberController.getMemberCount()];
        Member[] vList = new Member[MemberController.getMemberCount()];
        Member[] vvList = new Member[MemberController.getMemberCount()];

        Summary[] summary = {new Summary(oList), new Summary(gList), new Summary(vList), new Summary(vvList)};


        if ((parameters[1] == null) && (parameters[2] == null) && (parameters[3] == null)) {
            System.arraycopy(members, 0, oList, 0, MemberController.getMemberCount());
            count[0] = oList.length;
            return summary;
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
        return summary;
    }

    public void viewSummary(Parameter[] parameters, Summary[] summary) {

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

    public void summarySort(Parameter[] parameter, Summary[] summary, int menuNum) {

        Summary[] returnSummaray;
        String menu = "";
        do {
            System.out.println("** Press 'end', if you want to exit! **");
            System.out.println("Which order (ASCENDING, DESCENDING)?");
            menu = in.next().toUpperCase();
        } while (!(menu.equals("ASCENDING") || menu.equals("DESCENDING") || menu.equals("END")));

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

        if (menu.equals("ASCENDING")) {

            for (int i = 0; i < copy.length; i++) {
                if (count[i] == 0) {

                } else {
                    for (int j = 0; j < count[i]; j++) {
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
                if (count[i] == 0) {

                } else {
                    for (int j = 0; j < count[i]; j++) {
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
                if (count[i] == 0) {

                } else {
                    for (int j = 0; j < count[i]; j++) {
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
                if (count[i] == 0) {

                } else {
                    for (int j = 0; j < count[i]; j++) {
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
                if (count[i] == 0) {

                } else {
                    for (int j = 0; j < count[i]; j++) {
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
                if (count[i] == 0) {

                } else {
                    for (int j = 0; j < count[i]; j++) {
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


