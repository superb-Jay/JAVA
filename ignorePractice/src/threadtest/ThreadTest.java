package threadtest;

public class ThreadTest implements Runnable {

    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadTest());
        t.setDaemon(true);
        t.start();

        for (int i = 0; i <=10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);

            if (i == 5) {
                autoSave = true;
            }
        }
        System.out.println(" 프로 그램을 종료 합니다.");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
            }
            if (autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동으로 저장되었습니다.");

    }
}



