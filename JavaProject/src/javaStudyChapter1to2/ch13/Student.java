package javaStudyChapter1to2.ch13;

public class Student {

    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.takeBus(1000);
        this.money -= 1000;

    }
    public void takeSubway(Subway subway) {
        subway.takeSubway(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.takeTaxi(10000);
        this.money -= 10000;
    }


    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다.");
    }
}
