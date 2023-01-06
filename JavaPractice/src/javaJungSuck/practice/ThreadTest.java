package javaJungSuck.practice;

import javax.swing.*;

public class ThreadTest {

    public static void main(String[] args) {

//        Runnable r = new ThreadEx1();
//        Thread th1 = new Thread(r);

        ThreadEx2 th2 = new ThreadEx2();
        th2.setPriority(15);
        th2.start();
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

//        for (int i = 10; i > 0 ; i--) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {}
//        }


    }
}

//class ThreadEx1 implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 10; i > 0 ; i--) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {}
//        }
//    }
//}

class ThreadEx2 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }
}