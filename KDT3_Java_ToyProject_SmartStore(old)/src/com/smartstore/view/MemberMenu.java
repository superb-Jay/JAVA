package com.smartstore.view;

import com.smartstore.controller.GroupController;
import com.smartstore.controller.MemberController;

import java.util.Scanner;

public class MemberMenu {

    Scanner in = new Scanner(System.in);

    MemberController mc = new MemberController();
    GroupController gc = new GroupController();

    public void mainMenu() {
        int menuNum = 0;
        boolean run = true;

        while (run) {
            System.out.println("==========================");
            System.out.println("1. Classification Parameter");
            System.out.println("2. Customer Data");
            System.out.println("3. Summary");
            System.out.println("4. Quit");
            System.out.println("==========================");
            System.out.println("choose One: ");
            menuNum = in.nextInt();

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
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;

            }
        }
    }

    public void classificationParameter() {
        boolean run = true;
        int menuNum = 0;
        while (run) {
            System.out.println("==============================");
            System.out.println(" 1. Set Parameter");
            System.out.println(" 2. View Parameter");
            System.out.println(" 3. Update Parameter");
            System.out.println(" 4. Back");
            System.out.println("==============================");
            System.out.println("choose One: ");
            menuNum = in.nextInt();

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
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }


        }

    }

    public void customerData() {
        boolean run = true;
        int menuNum = 0;
        while (run) {
            System.out.println("==============================");
            System.out.println(" 1. Add Customer Data");
            System.out.println(" 2. View Customer Data");
            System.out.println(" 3. Update Customer Data");
            System.out.println(" 4. Delete Customer Data");
            System.out.println(" 5. Back");
            System.out.println("==============================");
            System.out.println("choose One: ");
            menuNum = in.nextInt();

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
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public void summary() {
        boolean run = true;
        int menuNum = 0;
        while (run) {
            System.out.println("==============================");
            System.out.println(" 1. Summary");
            System.out.println(" 2. Summary (Sorted By Name)");
            System.out.println(" 3. Summary (Sorted By Spent Time)");
            System.out.println(" 4. Summary (Sorted By Total Payment)");
            System.out.println(" 5. Back");
            System.out.println("==============================");
            System.out.println("choose One: ");
            menuNum = in.nextInt();

            switch (menuNum) {
                case 1:
                    gc.summaryAll();
                    break;
                case 2:
                    gc.summarySortName();
                    break;
                case 3:
                    gc.summarySortTime();
                    break;
                case 4:
                    gc.summarySortPayment();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }
}


