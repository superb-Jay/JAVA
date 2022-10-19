package com.smartstore.controller;

import com.smartstore.model.vo.General;
import com.smartstore.model.vo.Member;
import com.smartstore.model.vo.Vip;
import com.smartstore.model.vo.Vvip;

import java.util.*;

public class GroupController {

    Scanner in = new Scanner(System.in);
    boolean run = true;
    General g = new General();
    Vip v = new Vip();
    Vvip vv = new Vvip();

    Member[] m = MemberController.getInstance();


    public void setParameter() {
        while (run) {
            System.out.println("** Press 'end', if you want to exit! **");
            System.out.println("Which group (GENERAL, VIP, VVIP)?");
            String menu = in.next().toUpperCase();

            switch (menu) {
                case "GENERAL":
                    if (g.getGeneralSpentTime() == 0 && g.getGeneralTotalPay() == 0) {
                        general();
                    } else {
                        System.out.println("==============================");
                        System.out.println("GENERAL group already exists.");
                        System.out.println("GroupType: GENERAL");
                        System.out.println(g.toString());
                        System.out.println("==============================");
                    }
                    break;
                case "VIP":
                    if (v.getVipSpentTime() == 0 && v.getVipTotalPay() == 0) {
                        vip();
                    } else {
                        System.out.println("==============================");
                        System.out.println("VIP group already exists.");
                        System.out.println("GroupType: VIP");
                        System.out.println(v.toString());
                        System.out.println("==============================");
                    }
                    break;
                case "VVIP":
                    if (vv.getvVipSpentTime() == 0 && vv.getvVipTotalPay() == 0) {
                        vvip();
                    } else {
                        System.out.println("==============================");
                        System.out.println("VVIP group already exists.");
                        System.out.println("GroupType: VVIP");
                        System.out.println(vv.toString());
                        System.out.println("==============================");
                    }
                    break;
                case "END":
                    return;

                default:
                    System.out.println("Invalid Input. Please try again.");
                    return;
            }
        }
    }


    public void viewParameter() {

        while (true) {
            System.out.println("** Press 'end', if you want to exit! **");
            System.out.println("Which group (GENERAL, VIP, VVIP)?");
            String menu = in.next().toUpperCase();

            switch (menu) {
                case "GENERAL":
                    System.out.println("Parameter: " + g.toString());
                    break;
                case "VIP":
                    System.out.println("Parameter: " + v.toString());
                    break;
                case "VVIP":
                    System.out.println("Parameter: " + vv.toString());
                    break;
                case "END":
                    return;

                default:
                    System.out.println("Invalid Input. Please try again.");
                    return;
            }
        }
    }

    public void updateParameter() {
        while (true) {
            System.out.println("** Press 'end', if you want to exit! **");
            System.out.println("Which group (GENERAL, VIP, VVIP)?");
            String menu = in.next().toUpperCase();

            switch (menu) {
                case "GENERAL":
                    if (g.getGeneralTotalPay() == 0 && g.getGeneralSpentTime() == 0) {
                        System.out.println("No parameter. Set the parameter first.");
                    } else {
                        general();
                    }
                    break;
                case "VIP":
                    if (v.getVipTotalPay() == 0 && v.getVipSpentTime() == 0) {
                        System.out.println("No parameter. Set the parameter first.");
                    } else {
                        vip();
                    }
                    break;
                case "VVIP":
                    if (vv.getvVipTotalPay() == 0 && vv.getvVipSpentTime() == 0) {
                        System.out.println("No parameter. Set the parameter first.");
                    } else {
                        vvip();
                    }
                    break;
                case "END":
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    return;
            }
        }
    }

    public void general() {

        while (true) {
            System.out.println("==============================");
            System.out.println(" 1. Minimum Spent Time");
            System.out.println(" 2. Minimum Total Pay");
            System.out.println(" 3. Back & Save");
            System.out.println("==============================");
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Input Minimum Spent Time:");
                    g.setGeneralSpentTime(in.nextInt());
                    break;
                case 2:
                    System.out.println("Input Minimum Total Pay:");
                    g.setGeneralTotalPay(in.nextInt());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public void vip() {

        while (true) {
            System.out.println("==============================");
            System.out.println(" 1. Minimum Spent Time");
            System.out.println(" 2. Minimum Total Pay");
            System.out.println(" 3. Back & Save");
            System.out.println("==============================");
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Input Minimum Spent Time:");
                    v.setVipSpentTime(in.nextInt());
                    break;
                case 2:
                    System.out.println("Input Minimum Total Pay:");
                    v.setVipTotalPay(in.nextInt());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public void vvip() {

        while (true) {

            System.out.println("==============================");
            System.out.println(" 1. Minimum Spent Time");
            System.out.println(" 2. Minimum Total Pay");
            System.out.println(" 3. Back & Save");
            System.out.println("==============================");
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Input Minimum Spent Time:");
                    vv.setvVipSpentTime(in.nextInt());
                    break;
                case 2:
                    System.out.println("Input Minimum Total Pay:");
                    vv.setvVipTotalPay(in.nextInt());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public void summaryAll() {

        Member[] glistMember = new Member[MemberController.getMemberCount()];
        Member[] vlistMember = new Member[MemberController.getMemberCount()];
        Member[] vVlistMember = new Member[MemberController.getMemberCount()];
        Member[] olistMember = new Member[MemberController.getMemberCount()];

        int gCount = 0;
        int vCount = 0;
        int vvCount = 0;
        int oCount = 0;

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < MemberController.getMemberCount(); i++) {
                if (m[i].getSpentTime() > vv.getvVipSpentTime() && m[i].getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember[vvCount] = m[i];
                    vvCount++;
                } else if (m[i].getSpentTime() > v.getVipSpentTime() && m[i].getTotalPay() > v.getVipTotalPay()) {
                    vlistMember[vCount] = m[i];
                    vCount++;
                } else if (m[i].getSpentTime() > g.getGeneralSpentTime() && m[i].getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember[gCount] = m[i];
                    gCount++;
                } else {
                    olistMember[oCount] = m[i];
                    oCount++;
                }
            }
        } else {
            System.arraycopy(MemberController.getInstance(),0,olistMember,0,MemberController.getMemberCount());
            oCount = olistMember.length;
        }
        System.out.println("==============================");
        System.out.println("Others : " + oCount + " customer(s)");
        System.out.println("------------------------------");
        if (oCount == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < oCount; i++) {
                System.out.println("NO. " + (i + 1) + " => " + olistMember[i].toString());
            }
        }
        System.out.println("==============================");
        System.out.println("GENERAL Group : " + gCount + " customer(s)");
        System.out.println("[Parameter] " + g.toString());
        System.out.println("------------------------------");
        if (gCount == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < gCount; i++) {
                System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VIP Group : " + vCount + " customer(s)");
        System.out.println("[Parameter] " + v.toString());
        System.out.println("------------------------------");
        if (vCount == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vCount; i++) {
                System.out.println("NO. " + (i + 1) + " => " + vlistMember[i].toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VVIP Group : " + vvCount + " customer(s)");
        System.out.println("[Parameter] " + vv.toString());
        System.out.println("------------------------------");
        if (vvCount == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vvCount; i++) {
                System.out.println("NO. " + (i + 1) + " => " + vVlistMember[i].toString());
            }
        }
    }

    public void summarySortName() {
        System.out.println("** Press 'end', if you want to exit! **");
        System.out.println("Which order (ASCENDING, DESCENDING)?");
        String menu = in.next().toUpperCase();

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

    public void summarySortTime() {
        System.out.println("** Press 'end', if you want to exit! **");
        System.out.println("Which order (ASCENDING, DESCENDING)?");
        String menu = in.next().toUpperCase();

        switch (menu) {
            case "ASCENDING":
            case "DESCENDING":
                sortTime(menu);
                break;
            case "END":
                return;
            default:
                System.out.println("Invalid Input. Please try again.");
                break;
        }
    }

    public void summarySortPayment() {
        System.out.println("** Press 'end', if you want to exit! **");
        System.out.println("Which order (ASCENDING, DESCENDING)?");
        String menu = in.next().toUpperCase();


        switch (menu) {
            case "ASCENDING":
            case "DESCENDING":
                sortPayment(menu);
                break;
            case "END":
                return;
            default:
                System.out.println("Invalid Input. Please try again.");
                break;
        }
    }

    public void sortName(String menu) {

        Member[] glistMember = new Member[MemberController.getMemberCount()];
        Member[] vlistMember = new Member[MemberController.getMemberCount()];
        Member[] vVlistMember = new Member[MemberController.getMemberCount()];
        Member[] olistMember = new Member[MemberController.getMemberCount()];

        int gCount = 0;
        int vCount = 0;
        int vvCount = 0;
        int oCount = 0;

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < MemberController.getMemberCount(); i++) {
                if (m[i].getSpentTime() > vv.getvVipSpentTime() && m[i].getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember[vvCount] = m[i];
                    vvCount++;
                } else if (m[i].getSpentTime() > v.getVipSpentTime() && m[i].getTotalPay() > v.getVipTotalPay()) {
                    vlistMember[vCount] = m[i];
                    vCount++;
                } else if (m[i].getSpentTime() > g.getGeneralSpentTime() && m[i].getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember[gCount] = m[i];
                    gCount++;
                } else {
                    olistMember[oCount] = m[i];
                    oCount++;
                }
            }
        } else {
            System.arraycopy(MemberController.getInstance(),0,olistMember,0,MemberController.getInstance().length);
            oCount = olistMember.length;
        }
        if (menu.equals("ASCENDING")) {

            System.out.println("==============================");
            System.out.println("Others : " + oCount + " customer(s)");
            System.out.println("------------------------------");
            if (oCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < oCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (olistMember[i].getCustormerName().compareTo(olistMember[j].getCustormerName()) < 0) {
                            Member temp = olistMember[j];
                            olistMember[j] = olistMember[i];
                            olistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < oCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("GENERAL Group : " + gCount + " customer(s)");
            System.out.println("[Parameter] " + g.toString());
            System.out.println("------------------------------");
            if (gCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < gCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (glistMember[i].getCustormerName().compareTo(glistMember[j].getCustormerName()) < 0) {
                            Member temp = glistMember[j];
                            glistMember[j] = glistMember[i];
                            glistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < gCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VIP Group : " + vCount + " customer(s)");
            System.out.println("[Parameter] " + v.toString());
            System.out.println("------------------------------");
            if (vCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vlistMember[i].getCustormerName().compareTo(vlistMember[j].getCustormerName()) < 0) {
                            Member temp = vlistMember[j];
                            vlistMember[j] = vlistMember[i];
                            vlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < (vCount); i++) {
                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VVIP Group : " + vvCount + " customer(s)");
            System.out.println("[Parameter] " + vv.toString());
            System.out.println("------------------------------");
            if (vvCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vvCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vVlistMember[i].getCustormerName().compareTo(vVlistMember[i].getCustormerName()) < 0) {
                            Member temp = vVlistMember[j];
                            vVlistMember[j] = vVlistMember[i];
                            vVlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vvCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
                }
            }
        } else if (menu.equals("DESCENDING")) {
            System.out.println("==============================");
            System.out.println("Others : " + oCount + " customer(s)");
            System.out.println("------------------------------");
            if (oCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < oCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (olistMember[i].getCustormerName().compareTo(olistMember[j].getCustormerName()) > 0) {
                            Member temp = olistMember[j];
                            olistMember[j] = olistMember[i];
                            olistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < oCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("GENERAL Group : " + gCount + " customer(s)");
            System.out.println("[Parameter] " + g.toString());
            System.out.println("------------------------------");
            if (gCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < gCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (glistMember[i].getCustormerName().compareTo(glistMember[j].getCustormerName()) > 0) {
                            Member temp = glistMember[j];
                            glistMember[j] = glistMember[i];
                            glistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < gCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VIP Group : " + vCount + " customer(s)");
            System.out.println("[Parameter] " + v.toString());
            System.out.println("------------------------------");
            if (vCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vlistMember[i].getCustormerName().compareTo(vlistMember[j].getCustormerName()) > 0) {
                            Member temp = vlistMember[j];
                            vlistMember[j] = vlistMember[i];
                            vlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VVIP Group : " + vvCount + " customer(s)");
            System.out.println("[Parameter] " + vv.toString());
            System.out.println("------------------------------");
            if (vvCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vvCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vVlistMember[i].getCustormerName().compareTo(vVlistMember[j].getCustormerName()) > 0) {
                            Member temp = vVlistMember[j];
                            vVlistMember[j] = vVlistMember[i];
                            vVlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vvCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
                }
            }
        }
    }

    public void sortTime(String menu) {

        Member[] glistMember = new Member[MemberController.getMemberCount()];
        Member[] vlistMember = new Member[MemberController.getMemberCount()];
        Member[] vVlistMember = new Member[MemberController.getMemberCount()];
        Member[] olistMember = new Member[MemberController.getMemberCount()];

        int gCount = 0;
        int vCount = 0;
        int vvCount = 0;
        int oCount = 0;

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < MemberController.getMemberCount(); i++) {
                if (m[i].getSpentTime() > vv.getvVipSpentTime() && m[i].getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember[vvCount] = m[i];
                    vvCount++;
                } else if (m[i].getSpentTime() > v.getVipSpentTime() && m[i].getTotalPay() > v.getVipTotalPay()) {
                    vlistMember[vCount] = m[i];
                    vCount++;
                } else if (m[i].getSpentTime() > g.getGeneralSpentTime() && m[i].getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember[gCount] = m[i];
                    gCount++;
                } else {
                    olistMember[oCount] = m[i];
                    oCount++;
                }
            }
        } else {
            System.arraycopy(MemberController.getInstance(),0,olistMember,0,MemberController.getInstance().length);
            oCount = olistMember.length;
        }
        if (menu.equals("ASCENDING")) {

            System.out.println("==============================");
            System.out.println("Others : " + oCount + " customer(s)");
            System.out.println("------------------------------");
            if (oCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < oCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (olistMember[i].getSpentTime() < olistMember[j].getSpentTime()) {
                            Member temp = olistMember[j];
                            olistMember[j] = olistMember[i];
                            olistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < oCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("GENERAL Group : " + gCount + " customer(s)");
            System.out.println("[Parameter] " + g.toString());
            System.out.println("------------------------------");
            if (gCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < gCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (glistMember[i].getSpentTime() < glistMember[j].getSpentTime()) {
                            Member temp = glistMember[j];
                            glistMember[j] = glistMember[i];
                            glistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < gCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VIP Group : " + vCount + " customer(s)");
            System.out.println("[Parameter] " + v.toString());
            System.out.println("------------------------------");
            if (vCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vlistMember[i].getSpentTime() < vlistMember[j].getSpentTime()) {
                            Member temp = vlistMember[j];
                            vlistMember[j] = vlistMember[i];
                            vlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VVIP Group : " + vvCount + " customer(s)");
            System.out.println("[Parameter] " + vv.toString());
            System.out.println("------------------------------");
            if (vvCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vvCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vVlistMember[i].getSpentTime() < vVlistMember[j].getSpentTime()) {
                            Member temp = vVlistMember[j];
                            vVlistMember[j] = vVlistMember[i];
                            vVlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vvCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
                }
            }
        } else if (menu.equals("DESCENDING")) {

            System.out.println("==============================");
            System.out.println("Others : " + oCount + " customer(s)");
            System.out.println("------------------------------");
            if (oCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < oCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (olistMember[i].getSpentTime() > olistMember[j].getSpentTime()) {
                            Member temp = olistMember[j];
                            olistMember[j] = olistMember[i];
                            olistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < oCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("GENERAL Group : " + gCount + " customer(s)");
            System.out.println("[Parameter] " + g.toString());
            System.out.println("------------------------------");
            if (gCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < gCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (glistMember[i].getSpentTime() > glistMember[j].getSpentTime()) {
                            Member temp = glistMember[j];
                            glistMember[j] = glistMember[i];
                            glistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < gCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VIP Group : " + vCount + " customer(s)");
            System.out.println("[Parameter] " + v.toString());
            System.out.println("------------------------------");
            if (vCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vlistMember[i].getSpentTime() > vlistMember[j].getSpentTime()) {
                            Member temp = vlistMember[j];
                            vlistMember[j] = vlistMember[i];
                            vlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VVIP Group : " + vvCount + " customer(s)");
            System.out.println("[Parameter] " + vv.toString());
            System.out.println("------------------------------");
            if (vvCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vvCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vVlistMember[i].getSpentTime() > vVlistMember[j].getSpentTime()) {
                            Member temp = vVlistMember[j];
                            vVlistMember[j] = vVlistMember[i];
                            vVlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vvCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
                }
            }
        }
    }

    public void sortPayment(String menu) {

        Member[] glistMember = new Member[MemberController.getMemberCount()];
        Member[] vlistMember = new Member[MemberController.getMemberCount()];
        Member[] vVlistMember = new Member[MemberController.getMemberCount()];
        Member[] olistMember = new Member[MemberController.getMemberCount()];

        int gCount = 0;
        int vCount = 0;
        int vvCount = 0;
        int oCount = 0;

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < MemberController.getMemberCount(); i++) {
                if (m[i].getSpentTime() > vv.getvVipSpentTime() && m[i].getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember[vvCount] = m[i];
                    vvCount++;
                } else if (m[i].getSpentTime() > v.getVipSpentTime() && m[i].getTotalPay() > v.getVipTotalPay()) {
                    vlistMember[vCount] = m[i];
                    vCount++;
                } else if (m[i].getSpentTime() > g.getGeneralSpentTime() && m[i].getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember[gCount] = m[i];
                    gCount++;
                } else {
                    olistMember[oCount] = m[i];
                    oCount++;
                }
            }
        } else {
            System.arraycopy(MemberController.getInstance(),0,olistMember,0,MemberController.getInstance().length);
            oCount = olistMember.length;
        }
        if (menu.equals("ASCENDING")) {

            System.out.println("==============================");
            System.out.println("Others : " + oCount + " customer(s)");
            System.out.println("------------------------------");
            if (oCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < oCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (olistMember[i].getTotalPay() < olistMember[j].getTotalPay()) {
                            Member temp = olistMember[j];
                            olistMember[j] = olistMember[i];
                            olistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < oCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("GENERAL Group : " + gCount + " customer(s)");
            System.out.println("[Parameter] " + g.toString());
            System.out.println("------------------------------");
            if (gCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < gCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (glistMember[i].getTotalPay() < glistMember[j].getTotalPay()) {
                            Member temp = glistMember[j];
                            glistMember[j] = glistMember[i];
                            glistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < gCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VIP Group : " + vCount + " customer(s)");
            System.out.println("[Parameter] " + v.toString());
            System.out.println("------------------------------");
            if (vCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vlistMember[i].getTotalPay() < vlistMember[j].getTotalPay()) {
                            Member temp = vlistMember[j];
                            vlistMember[j] = vlistMember[i];
                            vlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VVIP Group : " + vvCount + " customer(s)");
            System.out.println("[Parameter] " + vv.toString());
            System.out.println("------------------------------");
            if (vvCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vvCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vVlistMember[i].getTotalPay() < vVlistMember[j].getTotalPay()) {
                            Member temp = vVlistMember[j];
                            vVlistMember[j] = vVlistMember[i];
                            vVlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vvCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
                }
            }
        } else if (menu.equals("DESCENDING")) {
            System.out.println("==============================");
            System.out.println("Others : " + oCount + " customer(s)");
            System.out.println("------------------------------");
            if (oCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < oCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (olistMember[i].getTotalPay() > olistMember[j].getTotalPay()) {
                            Member temp = olistMember[j];
                            olistMember[j] = olistMember[i];
                            olistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < oCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + olistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("GENERAL Group : " + gCount + " customer(s)");
            System.out.println("[Parameter] " + g.toString());
            System.out.println("------------------------------");
            if (gCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < gCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (glistMember[i].getTotalPay() > glistMember[j].getTotalPay()) {
                            Member temp = glistMember[j];
                            glistMember[j] = glistMember[i];
                            glistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < gCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + glistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VIP Group : " + vCount + " customer(s)");
            System.out.println("[Parameter] " + v.toString());
            System.out.println("------------------------------");
            if (vCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vlistMember[i].getTotalPay() > vlistMember[j].getTotalPay()) {
                            Member temp = vlistMember[j];
                            vlistMember[j] = vlistMember[i];
                            vlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vlistMember[i].toString());
                }
            }
            System.out.println("==============================");
            System.out.println("VVIP Group : " + vvCount + " customer(s)");
            System.out.println("[Parameter] " + vv.toString());
            System.out.println("------------------------------");
            if (vvCount == 0) {
                System.out.println("No customer.");
            } else {
                for (int i = 0; i < vvCount; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vVlistMember[i].getTotalPay() > vVlistMember[j].getTotalPay()) {
                            Member temp = vVlistMember[j];
                            vVlistMember[j] = vVlistMember[i];
                            vVlistMember[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < vvCount; i++) {
                    System.out.println("NO." + (i + 1) + " => " + vVlistMember[i].toString());
                }
            }
        }
    }
}
