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

    ArrayList<Member> m = MemberController.getInstance();


    public void setParameter() {
        while (run) {
            System.out.println("** Press 'end', if you want to exit! **");
            System.out.println("Which group (GENERAL, VIP, VVIP)?");
            String menu = in.next().toUpperCase();

            if (menu.equals("END")) {
                return;
            }

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
                default:
                    System.out.println("Invalid Input. Please try again.");
                    return;
            }
        }
    }


    public void viewParameter() {
        System.out.println("** Press 'end', if you want to exit! **");
        System.out.println("Which group (GENERAL, VIP, VVIP)?");
        String menu = in.next().toUpperCase();

        if (menu.equals("END")) {
            return;
        }

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
            default:
                System.out.println("Invalid Input. Please try again.");
                return;
        }

    }

    public void updateParameter() {

        System.out.println("** Press 'end', if you want to exit! **");
        System.out.println("Which group (GENERAL, VIP, VVIP)?");
        String menu = in.next().toUpperCase();

        if (menu.equals("END")) {
            return;
        }

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
            default:
                System.out.println("Invalid Input. Please try again.");
                return;
        }


    }

    public void general() {
        boolean run = true;
        while (run) {

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

        boolean run = true;
        while (run) {

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

        boolean run = true;

        while (run) {

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

        ArrayList<Member> glistMember = new ArrayList<>();
        ArrayList<Member> vlistMember = new ArrayList<>();
        ArrayList<Member> vVlistMember = new ArrayList<>();
        ArrayList<Member> olistMember = new ArrayList<>();

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).getSpentTime() > vv.getvVipSpentTime() && m.get(i).getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > v.getVipSpentTime() && m.get(i).getTotalPay() > v.getVipTotalPay()) {
                    vlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > g.getGeneralSpentTime() && m.get(i).getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember.add(m.get(i));
                } else {
                    olistMember.add(m.get(i));
                }
            }
        } else {
            olistMember.addAll(m);
        }
        System.out.println("==============================");
        System.out.println("Others : " + olistMember.size() + " customer(s)");
        System.out.println("------------------------------");
        if (olistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < olistMember.size(); i++) {
                System.out.println("NO. " + (i + 1) + " => " + olistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("GENERAL Group : " + glistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + g.toString());
        System.out.println("------------------------------");
        if (glistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < glistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + glistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VIP Group : " + vlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + v.toString());
        System.out.println("------------------------------");
        if (vlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vlistMember.size(); i++) {
                System.out.println("NO. " + (i + 1) + " => " + vlistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VVIP Group : " + vVlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + vv.toString());
        System.out.println("------------------------------");
        if (vVlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vVlistMember.size(); i++) {
                System.out.println("NO. " + (i + 1) + " => " + vVlistMember.get(i).toString());
            }
        }
    }

    public void summarySortName() {
        System.out.println("** Press 'end', if you want to exit! **");
        System.out.println("Which order (ASCENDING, DESCENDING)?");
        String menu = in.next().toUpperCase();

        switch (menu) {
            case "ASCENDING":
                sortNameAsc();
                break;
            case "DESCENDING":
                sortNameDesc();
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
                sortTimeAsc();
                break;
            case "DESCENDING":
                sortTimeDesc();
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
                sortPaymentAsc();
                break;
            case "DESCENDING":
                sortPaymentDesc();
                break;
            case "END":
                return;
            default:
                System.out.println("Invalid Input. Please try again.");
                break;
        }

    }

    public void sortNameAsc() {

        ArrayList<Member> glistMember = new ArrayList<>();
        ArrayList<Member> vlistMember = new ArrayList<>();
        ArrayList<Member> vVlistMember = new ArrayList<>();
        ArrayList<Member> olistMember = new ArrayList<>();

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).getSpentTime() > vv.getvVipSpentTime() && m.get(i).getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > v.getVipSpentTime() && m.get(i).getTotalPay() > v.getVipTotalPay()) {
                    vlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > g.getGeneralSpentTime() && m.get(i).getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember.add(m.get(i));
                } else {
                    olistMember.add(m.get(i));
                }
            }
        } else {
            olistMember.addAll(m);
        }

        System.out.println("==============================");
        System.out.println("Others : " + olistMember.size() + " customer(s)");
        System.out.println("------------------------------");
        if (olistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < olistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (olistMember.get(i).getCustormerName().compareTo(olistMember.get(j).getCustormerName()) < 0) {
                        Member temp = olistMember.get(j);
                        olistMember.set(j, olistMember.get(i));
                        olistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < olistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + olistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("GENERAL Group : " + glistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + g.toString());
        System.out.println("------------------------------");
        if (glistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < glistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (glistMember.get(i).getCustormerName().compareTo(glistMember.get(j).getCustormerName()) < 0) {
                        Member temp = glistMember.get(j);
                        glistMember.set(j, glistMember.get(i));
                        glistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < glistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + glistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VIP Group : " + vlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + v.toString());
        System.out.println("------------------------------");
        if (vlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vlistMember.get(i).getCustormerName().compareTo(vlistMember.get(j).getCustormerName()) < 0) {
                        Member temp = vlistMember.get(j);
                        vlistMember.set(j, vlistMember.get(i));
                        vlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vlistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VVIP Group : " + vVlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + vv.toString());
        System.out.println("------------------------------");
        if (vVlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vVlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vVlistMember.get(i).getCustormerName().compareTo(vVlistMember.get(j).getCustormerName()) < 0) {
                        Member temp = vVlistMember.get(j);
                        vVlistMember.set(j, vVlistMember.get(i));
                        vVlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vVlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vVlistMember.get(i).toString());
            }
        }
    }

    public void sortNameDesc() {

        ArrayList<Member> glistMember = new ArrayList<>();
        ArrayList<Member> vlistMember = new ArrayList<>();
        ArrayList<Member> vVlistMember = new ArrayList<>();
        ArrayList<Member> olistMember = new ArrayList<>();

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).getSpentTime() > vv.getvVipSpentTime() && m.get(i).getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > v.getVipSpentTime() && m.get(i).getTotalPay() > v.getVipTotalPay()) {
                    vlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > g.getGeneralSpentTime() && m.get(i).getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember.add(m.get(i));
                } else {
                    olistMember.add(m.get(i));
                }
            }
        } else {
            olistMember.addAll(m);
        }

        System.out.println("==============================");
        System.out.println("Others : " + olistMember.size() + " customer(s)");
        System.out.println("------------------------------");
        if (olistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < olistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (olistMember.get(i).getCustormerName().compareTo(olistMember.get(j).getCustormerName()) > 0) {
                        Member temp = olistMember.get(j);
                        olistMember.set(j, olistMember.get(i));
                        olistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < olistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + olistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("GENERAL Group : " + glistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + g.toString());
        System.out.println("------------------------------");
        if (glistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < glistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (glistMember.get(i).getCustormerName().compareTo(glistMember.get(j).getCustormerName()) > 0) {
                        Member temp = glistMember.get(j);
                        glistMember.set(j, glistMember.get(i));
                        glistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < glistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + glistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VIP Group : " + vlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + v.toString());
        System.out.println("------------------------------");
        if (vlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vlistMember.get(i).getCustormerName().compareTo(vlistMember.get(j).getCustormerName()) > 0) {
                        Member temp = vlistMember.get(j);
                        vlistMember.set(j, vlistMember.get(i));
                        vlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vlistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VVIP Group : " + vVlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + vv.toString());
        System.out.println("------------------------------");
        if (vVlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vVlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vVlistMember.get(i).getCustormerName().compareTo(vVlistMember.get(j).getCustormerName()) > 0) {
                        Member temp = vVlistMember.get(j);
                        vVlistMember.set(j, vVlistMember.get(i));
                        vVlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vVlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vVlistMember.get(i).toString());
            }
        }

    }

    public void sortTimeAsc() {

        ArrayList<Member> glistMember = new ArrayList<>();
        ArrayList<Member> vlistMember = new ArrayList<>();
        ArrayList<Member> vVlistMember = new ArrayList<>();
        ArrayList<Member> olistMember = new ArrayList<>();

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).getSpentTime() > vv.getvVipSpentTime() && m.get(i).getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > v.getVipSpentTime() && m.get(i).getTotalPay() > v.getVipTotalPay()) {
                    vlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > g.getGeneralSpentTime() && m.get(i).getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember.add(m.get(i));
                } else {
                    olistMember.add(m.get(i));
                }
            }
        } else {
            olistMember.addAll(m);
        }

        System.out.println("==============================");
        System.out.println("Others : " + olistMember.size() + " customer(s)");
        System.out.println("------------------------------");
        if (olistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < olistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (olistMember.get(i).getSpentTime() < olistMember.get(j).getSpentTime()) {
                        Member temp = olistMember.get(j);
                        olistMember.set(j, olistMember.get(i));
                        olistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < olistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + olistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("GENERAL Group : " + glistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + g.toString());
        System.out.println("------------------------------");
        if (glistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < glistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (glistMember.get(i).getSpentTime() < glistMember.get(j).getSpentTime()) {
                        Member temp = glistMember.get(j);
                        glistMember.set(j, glistMember.get(i));
                        glistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < glistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + glistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VIP Group : " + vlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + v.toString());
        System.out.println("------------------------------");
        if (vlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vlistMember.get(i).getSpentTime() < vlistMember.get(j).getSpentTime()) {
                        Member temp = vlistMember.get(j);
                        vlistMember.set(j, vlistMember.get(i));
                        vlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vlistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VVIP Group : " + vVlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + vv.toString());
        System.out.println("------------------------------");
        if (vVlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vVlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vVlistMember.get(i).getSpentTime() < vVlistMember.get(j).getSpentTime()) {
                        Member temp = vVlistMember.get(j);
                        vVlistMember.set(j, vVlistMember.get(i));
                        vVlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vVlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vVlistMember.get(i).toString());
            }
        }


    }

    public void sortTimeDesc() {

        ArrayList<Member> glistMember = new ArrayList<>();
        ArrayList<Member> vlistMember = new ArrayList<>();
        ArrayList<Member> vVlistMember = new ArrayList<>();
        ArrayList<Member> olistMember = new ArrayList<>();

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).getSpentTime() > vv.getvVipSpentTime() && m.get(i).getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > v.getVipSpentTime() && m.get(i).getTotalPay() > v.getVipTotalPay()) {
                    vlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > g.getGeneralSpentTime() && m.get(i).getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember.add(m.get(i));
                } else {
                    olistMember.add(m.get(i));
                }
            }
        } else {
            olistMember.addAll(m);
        }

        System.out.println("==============================");
        System.out.println("Others : " + olistMember.size() + " customer(s)");
        System.out.println("------------------------------");
        if (olistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < olistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (olistMember.get(i).getSpentTime() > olistMember.get(j).getSpentTime()) {
                        Member temp = olistMember.get(j);
                        olistMember.set(j, olistMember.get(i));
                        olistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < olistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + olistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("GENERAL Group : " + glistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + g.toString());
        System.out.println("------------------------------");
        if (glistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < glistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (glistMember.get(i).getSpentTime() > glistMember.get(j).getSpentTime()) {
                        Member temp = glistMember.get(j);
                        glistMember.set(j, glistMember.get(i));
                        glistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < glistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + glistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VIP Group : " + vlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + v.toString());
        System.out.println("------------------------------");
        if (vlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vlistMember.get(i).getSpentTime() > vlistMember.get(j).getSpentTime()) {
                        Member temp = vlistMember.get(j);
                        vlistMember.set(j, vlistMember.get(i));
                        vlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vlistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VVIP Group : " + vVlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + vv.toString());
        System.out.println("------------------------------");
        if (vVlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vVlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vVlistMember.get(i).getSpentTime() > vVlistMember.get(j).getSpentTime()) {
                        Member temp = vVlistMember.get(j);
                        vVlistMember.set(j, vVlistMember.get(i));
                        vVlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vVlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vVlistMember.get(i).toString());
            }
        }
    }

    public void sortPaymentAsc() {

        ArrayList<Member> glistMember = new ArrayList<>();
        ArrayList<Member> vlistMember = new ArrayList<>();
        ArrayList<Member> vVlistMember = new ArrayList<>();
        ArrayList<Member> olistMember = new ArrayList<>();

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).getSpentTime() > vv.getvVipSpentTime() && m.get(i).getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > v.getVipSpentTime() && m.get(i).getTotalPay() > v.getVipTotalPay()) {
                    vlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > g.getGeneralSpentTime() && m.get(i).getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember.add(m.get(i));
                } else {
                    olistMember.add(m.get(i));
                }
            }
        } else {
            olistMember.addAll(m);
        }

        System.out.println("==============================");
        System.out.println("Others : " + olistMember.size() + " customer(s)");
        System.out.println("------------------------------");
        if (olistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < olistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (olistMember.get(i).getTotalPay() < olistMember.get(j).getTotalPay()) {
                        Member temp = olistMember.get(j);
                        olistMember.set(j, olistMember.get(i));
                        olistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < olistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + olistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("GENERAL Group : " + glistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + g.toString());
        System.out.println("------------------------------");
        if (glistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < glistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (glistMember.get(i).getTotalPay() < glistMember.get(j).getTotalPay()) {
                        Member temp = glistMember.get(j);
                        glistMember.set(j, glistMember.get(i));
                        glistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < glistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + glistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VIP Group : " + vlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + v.toString());
        System.out.println("------------------------------");
        if (vlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vlistMember.get(i).getTotalPay() < vlistMember.get(j).getTotalPay()) {
                        Member temp = vlistMember.get(j);
                        vlistMember.set(j, vlistMember.get(i));
                        vlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vlistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VVIP Group : " + vVlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + vv.toString());
        System.out.println("------------------------------");
        if (vVlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vVlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vVlistMember.get(i).getTotalPay() < vVlistMember.get(j).getTotalPay()) {
                        Member temp = vVlistMember.get(j);
                        vVlistMember.set(j, vVlistMember.get(i));
                        vVlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vVlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vVlistMember.get(i).toString());
            }
        }


    }

    public void sortPaymentDesc() {

        ArrayList<Member> glistMember = new ArrayList<>();
        ArrayList<Member> vlistMember = new ArrayList<>();
        ArrayList<Member> vVlistMember = new ArrayList<>();
        ArrayList<Member> olistMember = new ArrayList<>();

        if (g.getGeneralSpentTime() != 0 || g.getGeneralTotalPay() != 0
                || v.getVipTotalPay() != 0 || v.getVipSpentTime() != 0
                || vv.getvVipTotalPay() != 0 || vv.getvVipSpentTime() != 0) {

            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).getSpentTime() > vv.getvVipSpentTime() && m.get(i).getTotalPay() > vv.getvVipTotalPay()) {
                    vVlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > v.getVipSpentTime() && m.get(i).getTotalPay() > v.getVipTotalPay()) {
                    vlistMember.add(m.get(i));
                } else if (m.get(i).getSpentTime() > g.getGeneralSpentTime() && m.get(i).getTotalPay() > g.getGeneralTotalPay()) {
                    glistMember.add(m.get(i));
                } else {
                    olistMember.add(m.get(i));
                }
            }
        } else {
            olistMember.addAll(m);
        }

        System.out.println("==============================");
        System.out.println("Others : " + olistMember.size() + " customer(s)");
        System.out.println("------------------------------");
        if (olistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < olistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (olistMember.get(i).getTotalPay() > olistMember.get(j).getTotalPay()) {
                        Member temp = olistMember.get(j);
                        olistMember.set(j, olistMember.get(i));
                        olistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < olistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + olistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("GENERAL Group : " + glistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + g.toString());
        System.out.println("------------------------------");
        if (glistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < glistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (glistMember.get(i).getTotalPay() > glistMember.get(j).getTotalPay()) {
                        Member temp = glistMember.get(j);
                        glistMember.set(j, glistMember.get(i));
                        glistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < glistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + glistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VIP Group : " + vlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + v.toString());
        System.out.println("------------------------------");
        if (vlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vlistMember.get(i).getTotalPay() > vlistMember.get(j).getTotalPay()) {
                        Member temp = vlistMember.get(j);
                        vlistMember.set(j, vlistMember.get(i));
                        vlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vlistMember.get(i).toString());
            }
        }
        System.out.println("==============================");
        System.out.println("VVIP Group : " + vVlistMember.size() + " customer(s)");
        System.out.println("[Parameter] " + vv.toString());
        System.out.println("------------------------------");
        if (vVlistMember.size() == 0) {
            System.out.println("No customer.");
        } else {
            for (int i = 0; i < vVlistMember.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (vVlistMember.get(i).getTotalPay() > vVlistMember.get(j).getTotalPay()) {
                        Member temp = vVlistMember.get(j);
                        vVlistMember.set(j, vVlistMember.get(i));
                        vVlistMember.set(i, temp);
                    }
                }
            }
            for (int i = 0; i < vVlistMember.size(); i++) {
                System.out.println("NO." + (i + 1) + " => " + vVlistMember.get(i).toString());
            }
        }
    }
}



