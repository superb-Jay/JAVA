package com.smartstore.controller;

import com.smartstore.model.vo.Column;
import com.smartstore.model.vo.Member;
import com.smartstore.model.vo.Parameter;
import com.smartstore.view.MainMenu;

import java.util.*;

public class GroupController {
    Scanner in = new Scanner(System.in);
    Parameter[] parameters = new Parameter[Column.values().length];

    public String parameterMenu() {
        String menu;
        do {
            System.out.println("** Press 'end', if you want to exit! **");
            System.out.println("Which group (GENERAL, VIP, VVIP)?");
            menu = in.next().toUpperCase();
        } while (!(menu.equals("GENERAL") || menu.equals("VIP") || menu.equals("VVIP") || menu.equals("END")));

        return menu;
    }

    public void setParameter() {
        String menu = parameterMenu();
        if (menu.equals("END")) {
            return;
        }

        int num = Column.valueOf(menu).getNum();

        if (parameters[num] == null) {
            insertPrameter(num);

        } else {
            System.out.println("==============================");
            System.out.println("GENERAL group already exists.");
            System.out.println("GroupType: " + Column.valueOf(menu).getName());
            System.out.println(parameters[num].prameterShowInfo(num));
            System.out.println("==============================");
        }
    }

    public void viewParameter() {
        String menu = parameterMenu();
        if (menu.equals("END")) {
            return;
        }
        int num = Column.valueOf(menu).getNum();
        System.out.println(parameters[num].prameterShowInfo(num));
    }

    public void updateParameter() {
        String menu = parameterMenu();
        if (menu.equals("END")) {
            return;
        }
        int num = Column.valueOf(menu).getNum();

        if (parameters[num] == null) {
            System.out.println("No parameter. Set the parameter first.");
        } else {
            insertPrameter(num);
        }
    }

    public void insertPrameter(int num) {

        int spentTime = 0;
        int totalPay = 0;

        while (true) {
            System.out.println("==============================");
            System.out.println(" 1. Minimum Spent Time");
            System.out.println(" 2. Minimum Total Pay");
            System.out.println(" 3. Back & Save");
            System.out.println("==============================");
            int menu = MainMenu.inputValidation(in.next());

            switch (menu) {
                case 1:
                    System.out.println("Input Minimum Spent Time:");
                    spentTime = in.nextInt();
                    break;
                case 2:
                    System.out.println("Input Minimum Total Pay:");
                    totalPay = in.nextInt();
                    break;
                case 3:
                    parameters[num] = new Parameter(spentTime, totalPay);
                    spentTime = 0;
                    totalPay = 0;
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public Parameter[] getParameters() {
        return parameters;
    }
}



//    public void summarySortTime() {
//        System.out.println("** Press 'end', if you want to exit! **");
//        System.out.println("Which order (ASCENDING, DESCENDING)?");
//        String menu = in.next().toUpperCase();
//
//        switch (menu) {
//            case "ASCENDING":
//            case "DESCENDING":
//                sortTime(menu);
//                break;
//            case "END":
//                return;
//            default:
//                System.out.println("Invalid Input. Please try again.");
//                break;
//        }
//    }

//    public void summarySortPayment() {
//        System.out.println("** Press 'end', if you want to exit! **");
//        System.out.println("Which order (ASCENDING, DESCENDING)?");
//        String menu = in.next().toUpperCase();
//
//
//        switch (menu) {
//            case "ASCENDING":
//            case "DESCENDING":
//                sortPayment(menu);
//                break;
//            case "END":
//                return;
//            default:
//                System.out.println("Invalid Input. Please try again.");
//                break;
//        }
//    }

//    public void sortName(String menu) {
//
//        Member[] glistMember = new Member[MemberController.getMemberCount()];
//        Member[] vlistMember = new Member[MemberController.getMemberCount()];
//        Member[] vVlistMember = new Member[MemberController.getMemberCount()];
//        Member[] olistMember = new Member[MemberController.getMemberCount()];
//
//        int gCount = 0;
//        int vCount = 0;
//        int vvCount = 0;
//        int oCount = 0;
//
//        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
//                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
//                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {
//
//            for (int i = 0; i < MemberController.getMemberCount(); i++) {
//                if (m[i].getSpentTime() > vv.getvVipSpentTime() && m[i].getTotalPay() > vv.getvVipTotalPay()) {
//                    vVlistMember[vvCount] = m[i];
//                    vvCount++;
//                } else if (m[i].getSpentTime() > v.getVipSpentTime() && m[i].getTotalPay() > v.getVipTotalPay()) {
//                    vlistMember[vCount] = m[i];
//                    vCount++;
//                } else if (m[i].getSpentTime() > g.getGeneralSpentTime() && m[i].getTotalPay() > g.getGeneralTotalPay()) {
//                    glistMember[gCount] = m[i];
//                    gCount++;
//                } else {
//                    olistMember[oCount] = m[i];
//                    oCount++;
//                }
//            }
//        } else {
//            System.arraycopy(m,0,olistMember,0,MemberController.getMemberCount());
//            oCount = olistMember.length;
//        }
//        if (menu.equals("ASCENDING")) {
//
//            System.out.println("==============================");
//            System.out.println("Others : " + oCount + " customer(s)");
//            System.out.println("------------------------------");
//            if (oCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < oCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (olistMember[i].getCustormerName().compareTo(olistMember[j].getCustormerName()) < 0) {
//                            Member temp = olistMember[j];
//                            olistMember[j] = olistMember[i];
//                            olistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < oCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("GENERAL Group : " + gCount + " customer(s)");
//            System.out.println("[Parameter] " + g.toString());
//            System.out.println("------------------------------");
//            if (gCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < gCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (glistMember[i].getCustormerName().compareTo(glistMember[j].getCustormerName()) < 0) {
//                            Member temp = glistMember[j];
//                            glistMember[j] = glistMember[i];
//                            glistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < gCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VIP Group : " + vCount + " customer(s)");
//            System.out.println("[Parameter] " + v.toString());
//            System.out.println("------------------------------");
//            if (vCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vlistMember[i].getCustormerName().compareTo(vlistMember[j].getCustormerName()) < 0) {
//                            Member temp = vlistMember[j];
//                            vlistMember[j] = vlistMember[i];
//                            vlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < (vCount); i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VVIP Group : " + vvCount + " customer(s)");
//            System.out.println("[Parameter] " + vv.toString());
//            System.out.println("------------------------------");
//            if (vvCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vvCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vVlistMember[i].getCustormerName().compareTo(vVlistMember[i].getCustormerName()) < 0) {
//                            Member temp = vVlistMember[j];
//                            vVlistMember[j] = vVlistMember[i];
//                            vVlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vvCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
//                }
//            }
//        } else if (menu.equals("DESCENDING")) {
//            System.out.println("==============================");
//            System.out.println("Others : " + oCount + " customer(s)");
//            System.out.println("------------------------------");
//            if (oCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < oCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (olistMember[i].getCustormerName().compareTo(olistMember[j].getCustormerName()) > 0) {
//                            Member temp = olistMember[j];
//                            olistMember[j] = olistMember[i];
//                            olistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < oCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("GENERAL Group : " + gCount + " customer(s)");
//            System.out.println("[Parameter] " + g.toString());
//            System.out.println("------------------------------");
//            if (gCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < gCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (glistMember[i].getCustormerName().compareTo(glistMember[j].getCustormerName()) > 0) {
//                            Member temp = glistMember[j];
//                            glistMember[j] = glistMember[i];
//                            glistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < gCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VIP Group : " + vCount + " customer(s)");
//            System.out.println("[Parameter] " + v.toString());
//            System.out.println("------------------------------");
//            if (vCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vlistMember[i].getCustormerName().compareTo(vlistMember[j].getCustormerName()) > 0) {
//                            Member temp = vlistMember[j];
//                            vlistMember[j] = vlistMember[i];
//                            vlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VVIP Group : " + vvCount + " customer(s)");
//            System.out.println("[Parameter] " + vv.toString());
//            System.out.println("------------------------------");
//            if (vvCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vvCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vVlistMember[i].getCustormerName().compareTo(vVlistMember[j].getCustormerName()) > 0) {
//                            Member temp = vVlistMember[j];
//                            vVlistMember[j] = vVlistMember[i];
//                            vVlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vvCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
//                }
//            }
//        }
//    }
//
//    public void sortTime(String menu) {
//
//        Member[] glistMember = new Member[MemberController.getMemberCount()];
//        Member[] vlistMember = new Member[MemberController.getMemberCount()];
//        Member[] vVlistMember = new Member[MemberController.getMemberCount()];
//        Member[] olistMember = new Member[MemberController.getMemberCount()];
//
//        int gCount = 0;
//        int vCount = 0;
//        int vvCount = 0;
//        int oCount = 0;
//
//        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
//                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
//                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {
//
//            for (int i = 0; i < MemberController.getMemberCount(); i++) {
//                if (m[i].getSpentTime() > vv.getvVipSpentTime() && m[i].getTotalPay() > vv.getvVipTotalPay()) {
//                    vVlistMember[vvCount] = m[i];
//                    vvCount++;
//                } else if (m[i].getSpentTime() > v.getVipSpentTime() && m[i].getTotalPay() > v.getVipTotalPay()) {
//                    vlistMember[vCount] = m[i];
//                    vCount++;
//                } else if (m[i].getSpentTime() > g.getGeneralSpentTime() && m[i].getTotalPay() > g.getGeneralTotalPay()) {
//                    glistMember[gCount] = m[i];
//                    gCount++;
//                } else {
//                    olistMember[oCount] = m[i];
//                    oCount++;
//                }
//            }
//        } else {
//            System.arraycopy(m,0,olistMember,0,MemberController.getMemberCount());
//            oCount = olistMember.length;
//        }
//        if (menu.equals("ASCENDING")) {
//
//            System.out.println("==============================");
//            System.out.println("Others : " + oCount + " customer(s)");
//            System.out.println("------------------------------");
//            if (oCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < oCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (olistMember[i].getSpentTime() < olistMember[j].getSpentTime()) {
//                            Member temp = olistMember[j];
//                            olistMember[j] = olistMember[i];
//                            olistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < oCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("GENERAL Group : " + gCount + " customer(s)");
//            System.out.println("[Parameter] " + g.toString());
//            System.out.println("------------------------------");
//            if (gCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < gCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (glistMember[i].getSpentTime() < glistMember[j].getSpentTime()) {
//                            Member temp = glistMember[j];
//                            glistMember[j] = glistMember[i];
//                            glistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < gCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VIP Group : " + vCount + " customer(s)");
//            System.out.println("[Parameter] " + v.toString());
//            System.out.println("------------------------------");
//            if (vCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vlistMember[i].getSpentTime() < vlistMember[j].getSpentTime()) {
//                            Member temp = vlistMember[j];
//                            vlistMember[j] = vlistMember[i];
//                            vlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VVIP Group : " + vvCount + " customer(s)");
//            System.out.println("[Parameter] " + vv.toString());
//            System.out.println("------------------------------");
//            if (vvCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vvCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vVlistMember[i].getSpentTime() < vVlistMember[j].getSpentTime()) {
//                            Member temp = vVlistMember[j];
//                            vVlistMember[j] = vVlistMember[i];
//                            vVlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vvCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
//                }
//            }
//        } else if (menu.equals("DESCENDING")) {
//
//            System.out.println("==============================");
//            System.out.println("Others : " + oCount + " customer(s)");
//            System.out.println("------------------------------");
//            if (oCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < oCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (olistMember[i].getSpentTime() > olistMember[j].getSpentTime()) {
//                            Member temp = olistMember[j];
//                            olistMember[j] = olistMember[i];
//                            olistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < oCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("GENERAL Group : " + gCount + " customer(s)");
//            System.out.println("[Parameter] " + g.toString());
//            System.out.println("------------------------------");
//            if (gCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < gCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (glistMember[i].getSpentTime() > glistMember[j].getSpentTime()) {
//                            Member temp = glistMember[j];
//                            glistMember[j] = glistMember[i];
//                            glistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < gCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VIP Group : " + vCount + " customer(s)");
//            System.out.println("[Parameter] " + v.toString());
//            System.out.println("------------------------------");
//            if (vCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vlistMember[i].getSpentTime() > vlistMember[j].getSpentTime()) {
//                            Member temp = vlistMember[j];
//                            vlistMember[j] = vlistMember[i];
//                            vlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VVIP Group : " + vvCount + " customer(s)");
//            System.out.println("[Parameter] " + vv.toString());
//            System.out.println("------------------------------");
//            if (vvCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vvCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vVlistMember[i].getSpentTime() > vVlistMember[j].getSpentTime()) {
//                            Member temp = vVlistMember[j];
//                            vVlistMember[j] = vVlistMember[i];
//                            vVlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vvCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
//                }
//            }
//        }
//    }
//
//    public void sortPayment(String menu) {
//
//        Member[] glistMember = new Member[MemberController.getMemberCount()];
//        Member[] vlistMember = new Member[MemberController.getMemberCount()];
//        Member[] vVlistMember = new Member[MemberController.getMemberCount()];
//        Member[] olistMember = new Member[MemberController.getMemberCount()];
//
//        int gCount = 0;
//        int vCount = 0;
//        int vvCount = 0;
//        int oCount = 0;
//
//        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
//                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
//                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {
//
//            for (int i = 0; i < MemberController.getMemberCount(); i++) {
//                if (m[i].getSpentTime() > vv.getvVipSpentTime() && m[i].getTotalPay() > vv.getvVipTotalPay()) {
//                    vVlistMember[vvCount] = m[i];
//                    vvCount++;
//                } else if (m[i].getSpentTime() > v.getVipSpentTime() && m[i].getTotalPay() > v.getVipTotalPay()) {
//                    vlistMember[vCount] = m[i];
//                    vCount++;
//                } else if (m[i].getSpentTime() > g.getGeneralSpentTime() && m[i].getTotalPay() > g.getGeneralTotalPay()) {
//                    glistMember[gCount] = m[i];
//                    gCount++;
//                } else {
//                    olistMember[oCount] = m[i];
//                    oCount++;
//                }
//            }
//        } else {
//            System.arraycopy(m,0,olistMember,0,MemberController.getMemberCount());
//            oCount = olistMember.length;
//        }
//        if (menu.equals("ASCENDING")) {
//
//            System.out.println("==============================");
//            System.out.println("Others : " + oCount + " customer(s)");
//            System.out.println("------------------------------");
//            if (oCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < oCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (olistMember[i].getTotalPay() < olistMember[j].getTotalPay()) {
//                            Member temp = olistMember[j];
//                            olistMember[j] = olistMember[i];
//                            olistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < oCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("GENERAL Group : " + gCount + " customer(s)");
//            System.out.println("[Parameter] " + g.toString());
//            System.out.println("------------------------------");
//            if (gCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < gCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (glistMember[i].getTotalPay() < glistMember[j].getTotalPay()) {
//                            Member temp = glistMember[j];
//                            glistMember[j] = glistMember[i];
//                            glistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < gCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VIP Group : " + vCount + " customer(s)");
//            System.out.println("[Parameter] " + v.toString());
//            System.out.println("------------------------------");
//            if (vCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vlistMember[i].getTotalPay() < vlistMember[j].getTotalPay()) {
//                            Member temp = vlistMember[j];
//                            vlistMember[j] = vlistMember[i];
//                            vlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VVIP Group : " + vvCount + " customer(s)");
//            System.out.println("[Parameter] " + vv.toString());
//            System.out.println("------------------------------");
//            if (vvCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vvCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vVlistMember[i].getTotalPay() < vVlistMember[j].getTotalPay()) {
//                            Member temp = vVlistMember[j];
//                            vVlistMember[j] = vVlistMember[i];
//                            vVlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vvCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
//                }
//            }
//        } else if (menu.equals("DESCENDING")) {
//            System.out.println("==============================");
//            System.out.println("Others : " + oCount + " customer(s)");
//            System.out.println("------------------------------");
//            if (oCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < oCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (olistMember[i].getTotalPay() > olistMember[j].getTotalPay()) {
//                            Member temp = olistMember[j];
//                            olistMember[j] = olistMember[i];
//                            olistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < oCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("GENERAL Group : " + gCount + " customer(s)");
//            System.out.println("[Parameter] " + g.toString());
//            System.out.println("------------------------------");
//            if (gCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < gCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (glistMember[i].getTotalPay() > glistMember[j].getTotalPay()) {
//                            Member temp = glistMember[j];
//                            glistMember[j] = glistMember[i];
//                            glistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < gCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VIP Group : " + vCount + " customer(s)");
//            System.out.println("[Parameter] " + v.toString());
//            System.out.println("------------------------------");
//            if (vCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vlistMember[i].getTotalPay() > vlistMember[j].getTotalPay()) {
//                            Member temp = vlistMember[j];
//                            vlistMember[j] = vlistMember[i];
//                            vlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
//                }
//            }
//            System.out.println("==============================");
//            System.out.println("VVIP Group : " + vvCount + " customer(s)");
//            System.out.println("[Parameter] " + vv.toString());
//            System.out.println("------------------------------");
//            if (vvCount == 0) {
//                System.out.println("No customer.");
//            } else {
//                for (int i = 0; i < vvCount; i++) {
//                    for (int j = 0; j < i; j++) {
//                        if (vVlistMember[i].getTotalPay() > vVlistMember[j].getTotalPay()) {
//                            Member temp = vVlistMember[j];
//                            vVlistMember[j] = vVlistMember[i];
//                            vVlistMember[i] = temp;
//                        }
//                    }
//                }
//                for (int i = 0; i < vvCount; i++) {
//                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
//                }
//            }
//        }



