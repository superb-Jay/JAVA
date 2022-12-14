package threadtest;

import javax.swing.*;


public class InterrupTest {

    public static void main(String[] args) {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력해주세요.");
        System.out.println("입력하신 값은" + input + "입니다.");
        th1.interrupt();
        System.out.println("isInturrupted():" + th1.isInterrupted());


    }
}


class ThreadEx9_1 extends Thread {
    @Override
    public void run() {
        int  i= 10;

        while (i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for (long j = 0; j < 2500000000L ; j++) {

            }
        }
        System.out.println("카운트가 종료 되었습니다.");
    }
}