package javaStudyChapter1to2.ch13;

public class TakeTransTest {
    public static void main(String[] args) {

        Student studentJames = new Student("James",5000);
        Student studentTomas = new Student("Tomas",10000);
        Student studentEd = new Student("Edward",10000 );

        Taxi taxi = new Taxi("잘 간다 운수택시");

        studentEd.takeTaxi(taxi);
        studentEd.showInfo();
        taxi.taxiShowInfo();



//        Bus bus100 = new Bus(100);
//        Bus bus500 = new Bus(500);
//
//        studentJames.takeBus(bus100);
//
//        Subway greenSubway = new Subway(2);
//        studentTomas.takeSubway(greenSubway);
//
//        studentJames.showInfo();
//        studentTomas.showInfo();
//
//        bus100.showInfo();
//        bus500.showInfo();
//
//        greenSubway.showSubwayInfo();
    }
}
