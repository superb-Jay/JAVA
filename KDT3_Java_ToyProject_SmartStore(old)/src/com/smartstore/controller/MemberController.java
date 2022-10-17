package com.smartstore.controller;
import com.smartstore.model.vo.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

    Scanner in = new Scanner(System.in);
    Member m = new Member();
    boolean run = true;

    private static ArrayList<Member> listMember = new ArrayList<>();

    public static ArrayList<Member> getInstance() {
        if (listMember == null) {
            return new ArrayList<>();
        } else {
            return listMember;
        }
    }

    public void addCustomerData() {

        System.out.println("** Press -1, if you want to exit! **");
        System.out.println("How many customers to input?");
        int size = in.nextInt();

        if (size == -1) {
            return;
        }
        int count = 0;

        while (run) {

            if (count != size) {

                System.out.println("====== Customer " + (count + 1) + " Info. ======");
                System.out.println("==============================");
                System.out.println(" 1. Customer Name");
                System.out.println(" 2. Customer ID");
                System.out.println(" 3. Customer Spent Time");
                System.out.println(" 4. Customer Total Pay");
                System.out.println(" 5. Save & Back");
                System.out.println("==============================");
                System.out.println("choose One: ");
                int menuNum = in.nextInt();

                switch (menuNum) {
                    case 1:
                        System.out.println("Input Customer's Name:");
                        m.setCustormerName(in.next());
                        break;
                    case 2:
                        System.out.println("Input Customer's UserID:");
                        m.setCustomerId(in.next());
                        break;
                    case 3:
                        System.out.println("Input Customer's Spent Time at Your Store:");
                        m.setSpentTime(in.nextInt());
                        break;
                    case 4:
                        System.out.println("Input Customer's Total Payment at Your Store:");
                        m.setTotalPay(in.nextInt());
                        break;
                    case 5:
                        listMember.add(m);
                        m = new Member();
                        count++;
                        break;

                    default:
                        System.out.println("Invalid Input. Please try again.");
                }
            } else {
                return;
            }
        }
    }

    public void viewCustomerData() {
        System.out.println("======= Customer Info. =======");
        for (int i = 0; i < listMember.size(); i++) {
            System.out.println("No. " + (i + 1) + "=> Customer" + listMember.get(i).toString());
        }

    }

    public void updateCustomerData() {
        viewCustomerData();
        System.out.println("Which customer ( 1 ~ 0 )?");
        int serialNum = in.nextInt();
        boolean run = true;

        while (run) {
            System.out.println("==============================");
            System.out.println(" 1. Customer Name");
            System.out.println(" 2. Customer ID");
            System.out.println(" 3. Customer Spent Time");
            System.out.println(" 4. Customer Total Pay");
            System.out.println(" 5. Save & Back");
            System.out.println("==============================");
            System.out.println("choose One: ");
            int menuNum = in.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.println("Input Customer's Name:");
                    for (int i = 0; i < listMember.size(); i++) {
                        if (listMember.get(i).getCustomerNumber() == serialNum) {
                            listMember.get(i).setCustormerName(in.next());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Input Customer's UserID:");
                    m.setCustomerId(in.next());
                    for (int i = 0; i < listMember.size(); i++) {
                        if (listMember.get(i).getCustomerNumber() == serialNum) {
                            listMember.get(i).setCustomerId(in.next());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Input Customer's Spent Time at Your Store:");
                    m.setSpentTime(in.nextInt());
                    for (int i = 0; i < listMember.size(); i++) {
                        if (listMember.get(i).getCustomerNumber() == serialNum) {
                            listMember.get(i).setSpentTime(in.nextInt());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Input Customer's Total Payment at Your Store:");
                    m.setTotalPay(in.nextInt());
                    for (int i = 0; i < listMember.size(); i++) {
                        if (listMember.get(i).getCustomerNumber() == serialNum) {
                            listMember.get(i).setTotalPay(in.nextInt());
                        }
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }


    }

    public void deleteCustomerData() {
        viewCustomerData();
        System.out.println("Which customer ( 1 ~ 0 )?");
        int serialNum = in.nextInt();
        boolean run = true;
        for (int i = 0; i < listMember.size(); i++) {
            if (listMember.get(i).getCustomerNumber() == serialNum) {
                listMember.remove(i);
            }
        }
        System.out.println("Customer Data Deleted Successfully !");
        viewCustomerData();
    }



}
