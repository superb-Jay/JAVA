package com.smartstore.controller;

import com.smartstore.model.vo.Member;
import com.smartstore.view.MainMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;


public class MemberController {

    Scanner in = new Scanner(System.in);

    private Member[] mem = new Member[1];
    private static int memberCount = 0;

    public void addCustomerData() {
        int size = 0;
        boolean run = true;

        while(run) {

            System.out.println("** Press -1, if you want to exit! **");
            System.out.println("How many customers to input?");
            System.out.println("choose One: ");
            String str = "";
            try {
                str = in.next();
                size = Integer.parseInt(str);
                if (size == -1) {
                    return;
                }
            } catch (NumberFormatException e) {

            }
            if (size > 0 && size < 2147483647) {
                run = false;
            }
        }

        int count = 0;
        String name = null;
        String id = null;
        int time = 0;
        int pay = 0;

        while (true) {

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

                String str = "";
                int menuNum;
                try {
                    str = in.next();
                    menuNum = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    menuNum = 0;
                }


                switch (menuNum) {
                    case 1:
                        System.out.println("Input Customer's Name:");
                        name = in.next();
                        break;
                    case 2:
                        System.out.println("Input Customer's UserID:");
                        id = in.next();
                        break;
                    case 3:
                        boolean run3 = true;
                        while (run3) {
                            System.out.println("Input Customer's Spent Time at Your Store:");
                            try {
                                str = in.next();
                                time = Integer.parseInt(str);
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid Input. Please try again.");
                            }
                            run3 = false;
                        }
                        break;
                    case 4:
                        boolean run2 = true;
                        while (run2) {
                            System.out.println("Input Customer's Total Payment at Your Store:");
                            try {
                                str = in.next();
                                time = Integer.parseInt(str);
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid Input. Please try again.");
                            }
                            run2 = false;
                        }
                        break;
                    case 5:
                        if (memberCount + 1 == mem.length) {
                            mem = addMem(new Member(name, id, time, pay));
                            count++;
                        } else {
                            insertMember(new Member(name, id, time, pay));
                            count++;
                        }
                        name = null;
                        id = null;
                        time = 0;
                        pay = 0;
                        break;

                    default:
                        System.out.println("Invalid Input. Please try again.");
                }

            } else {
                return;
            }
        }
    }


    public Member[] addMem(Member m) {
        Member[] newMem = Arrays.copyOf(mem, mem.length * 2);
        newMem[memberCount] = m;
        memberCount++;
        return newMem;
    }


    public void insertMember(Member m) {
        mem[memberCount] = m;
        memberCount++;
    }


    public void viewCustomerData() {
        System.out.println("======= Customer Info. =======");
        for (int i = 0; i < memberCount; i++) {
            System.out.println("No. " + (i + 1) + "=> Customer" + mem[i].toString());
        }
    }

    public void updateCustomerData() {
        viewCustomerData();

        boolean run = true;
        int serialNum = 0;
        String str = "";

        while(run) {
            System.out.println("Which customer ( 1 ~ " + MemberController.getMemberCount() +" )");
            try {
                str = in.next();
                serialNum = Integer.parseInt(str);
            } catch (NumberFormatException e) {
            }
            if(serialNum > 0 && serialNum <= MemberController.getMemberCount() ) {
                run = false;
            }else{
                System.out.println("Invalid Input. Please try again.");
            }
        }

        while (true) {
            System.out.println("==============================");
            System.out.println(" 1. Customer Name");
            System.out.println(" 2. Customer ID");
            System.out.println(" 3. Customer Spent Time");
            System.out.println(" 4. Customer Total Pay");
            System.out.println(" 5. Save & Back");
            System.out.println("==============================");
            System.out.println("choose One: ");
            int menuNum;
            try {
                str = in.next();
                menuNum = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                menuNum = 0;
            }

            switch (menuNum) {
                case 1:
                    System.out.println("Input Customer's Name:");
                    for (int i = 0; i < memberCount; i++) {
                        if (mem[i].getCustomerNumber() == serialNum) {
                            mem[i].setCustormerName(in.next());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Input Customer's UserID:");
                    for (int i = 0; i < memberCount; i++) {
                        if (mem[i].getCustomerNumber() == serialNum) {
                            mem[i].setCustomerId(in.next());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Input Customer's Spent Time at Your Store:");
                    for (int i = 0; i < memberCount; i++) {
                        if (mem[i].getCustomerNumber() == serialNum) {
                            mem[i].setSpentTime(in.nextInt());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Input Customer's Total Payment at Your Store:");
//                    m.setTotalPay(in.nextInt());
                    for (int i = 0; i < memberCount; i++) {
                        if (mem[i].getCustomerNumber() == serialNum) {
                            mem[i].setTotalPay(in.nextInt());
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

        if(MemberController.getMemberCount() == 0) {
            System.out.println("No. Customers!!!!!!!!!!!!!!!!!!!!!!!!");

        }else{

            viewCustomerData();
            boolean run = true;
            int serialNum = 0;

            while(run) {
                System.out.println("Which customer ( 1 ~ " + MemberController.getMemberCount() +" )");
                String str = "";
                try {
                    str = in.next();
                    serialNum = Integer.parseInt(str);
                } catch (NumberFormatException e) {

                }
                if(serialNum > 0 && serialNum <= MemberController.getMemberCount()) {
                    run = false;
                }else{
                    System.out.println("Invalid Input. Please try again.");
                }
            }

            int deleteIndex = 0;
            for (int i = 0; i < memberCount; i++) {
                if (mem[i].getCustomerNumber() == serialNum) {
                    deleteIndex = i;
                }
            }
            Member[] newMem = new Member[mem.length - 1];
            System.arraycopy(mem, 0, newMem, 0, deleteIndex);
            System.arraycopy(mem, deleteIndex + 1, newMem, deleteIndex, mem.length - deleteIndex - 1);
            mem = newMem;
            memberCount--;
            System.out.println("Customer Data Deleted Successfully !");
            viewCustomerData();
        }
    }

    public static int getMemberCount() {
        return memberCount;
    }

    public Member[] getMem() {
        return mem;
    }

    @Override
    public String toString() {
        return "MemberController{" +
                "mem=" + Arrays.toString(mem) +
                '}';
    }
}
