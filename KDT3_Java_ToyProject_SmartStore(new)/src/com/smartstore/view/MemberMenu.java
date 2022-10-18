package com.smartstore.view;

import com.smartstore.controller.GroupController;
import com.smartstore.controller.MemberController;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MemberMenu {

    Scanner in = new Scanner(System.in);
    final String num = "^[0-9]+$"; // 숫자만
    MemberController mc = new MemberController();
    GroupController gc = new GroupController();

    public void mainMenu() {

        String str;

        while (true) {
            do {
                System.out.println("==========================");
                System.out.println("1. Classification Parameter");
                System.out.println("2. Customer Data");
                System.out.println("3. Summary");
                System.out.println("4. Quit");
                System.out.println("==========================");
                System.out.println("choose One: ");
                str = in.next();
            } while (!(Pattern.matches(num, str)));
            int menuNum = Integer.parseInt(str);

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

        String str;

        while (true) {
            do {
                System.out.println("==============================");
                System.out.println(" 1. Set Parameter");
                System.out.println(" 2. View Parameter");
                System.out.println(" 3. Update Parameter");
                System.out.println(" 4. Back");
                System.out.println("==============================");
                System.out.println("choose One: ");
                str = in.next();
            } while (!(Pattern.matches(num, str)));
            int menuNum = Integer.parseInt(str);

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
        String str;

        while (true) {
            do {
                System.out.println("==============================");
                System.out.println(" 1. Add Customer Data");
                System.out.println(" 2. View Customer Data");
                System.out.println(" 3. Update Customer Data");
                System.out.println(" 4. Delete Customer Data");
                System.out.println(" 5. Back");
                System.out.println("==============================");
                System.out.println("choose One: ");
                str = in.next();
            } while (!(Pattern.matches(num, str)));
            int menuNum = Integer.parseInt(str);

            switch (menuNum) {
                case 1:
                    mc.addCustomerData();
                    break;
                case 2:
                    mc.viewCustomerData();
                    break;
                case 3:
                    if(MemberController.getMemberCount() != 0) {
                        mc.updateCustomerData();
                    }else{
                        System.out.println("No customer.");
                    }
                    break;
                case 4:
                    if(MemberController.getMemberCount() != 0) {
                        mc.deleteCustomerData();
                    }else{
                        System.out.println("No customer.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }

    public void summary() {
        String str;

        while (true) {
            do {
                System.out.println("==============================");
                System.out.println(" 1. Summary");
                System.out.println(" 2. Summary (Sorted By Name)");
                System.out.println(" 3. Summary (Sorted By Spent Time)");
                System.out.println(" 4. Summary (Sorted By Total Payment)");
                System.out.println(" 5. Back");
                System.out.println("==============================");
                str = in.next();
            } while (!(Pattern.matches(num, str)));
            int menuNum = Integer.parseInt(str);

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


