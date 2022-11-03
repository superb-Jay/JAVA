package com.smartstore.view;

import com.smartstore.controller.GroupController;
import com.smartstore.controller.MemberController;
import com.smartstore.controller.Summary;
import com.smartstore.run.Run;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainMenu {
    Scanner in = new Scanner(System.in);
    MemberController mc = new MemberController();
    Summary s = new Summary();
    GroupController gc = new GroupController();

    public void mainMenu() {

        while (true) {

            System.out.println("==========================");
            System.out.println("1. Classification Parameter");
            System.out.println("2. Customer Data");
            System.out.println("3. Summary");
            System.out.println("4. Quit");
            System.out.println("==========================");
            System.out.println("choose One: ");

            int menuNum = inputValidation(in.next());

            switch (menuNum) {
                case 1:
                    classificationParameter();
                    break;
                case 2:
                    customerData();
                    break;
                case 3:
                    summary();
                    break;
                case 4:
                    System.out.println("Program Finished.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public void classificationParameter() {

        while (true) {

            System.out.println("==========================");
            System.out.println(" 1. Set Parameter");
            System.out.println(" 2. View Parameter");
            System.out.println(" 3. Update Parameter");
            System.out.println(" 4. Back");
            System.out.println("==========================");
            System.out.println("choose One: ");

            int menuNum = inputValidation(in.next());

            switch (menuNum) {
                case 1:
                    gc.setParameter();
                    break;
                case 2:
                    gc.viewParameter();
                    break;
                case 3:
                    gc.updateParameter();
                    break;
                case 4:
                    mainMenu();
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public void customerData() {

        while (true) {

            System.out.println("==========================");
            System.out.println(" 1. Add Customer Data");
            System.out.println(" 2. View Customer Data");
            System.out.println(" 3. Update Customer Data");
            System.out.println(" 4. Delete Customer Data");
            System.out.println(" 5. Back");
            System.out.println("==========================");
            System.out.println("choose One: ");

            int menuNum = inputValidation(in.next());

            switch (menuNum) {
                case 1:
                    mc.addCustomerData();
                    break;
                case 2:
                    mc.viewCustomerData();
                    break;
                case 3:
                    mc.updateCustomerData();
                    break;
                case 4:
                    mc.deleteCustomerData();
                case 5:
                    mainMenu();
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public void summary() {

        while (true) {

            System.out.println("==========================");
            System.out.println(" 1. Summary");
            System.out.println(" 2. Summary (Sorted By Name)");
            System.out.println(" 3. Summary (Sorted By Spent Time)");
            System.out.println(" 4. Summary (Sorted By Total Payment)");
            System.out.println(" 5. Back");
            System.out.println("==========================");
            System.out.println("choose One: ");
            int menuNum = inputValidation(in.next());
            Summary[] summaryAll = s.summaryAll(mc.getMem(), gc.getParameters());

            switch (menuNum) {
                case 1:
                    s.viewSummary(gc.getParameters(), summaryAll);
                    break;
                case 2:
                case 3:
                case 4:
                    s.summarySort(gc.getParameters(), summaryAll, menuNum);
                    break;
                case 5:
                    return;
            }
        }
    }

    public static int inputValidation(String input) {
        String str = "";
        int num;
        try {
            str = input;
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            num = 0;
        }
        return num;
    }
}


