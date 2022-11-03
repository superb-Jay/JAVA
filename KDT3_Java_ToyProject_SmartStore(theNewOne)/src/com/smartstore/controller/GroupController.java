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



