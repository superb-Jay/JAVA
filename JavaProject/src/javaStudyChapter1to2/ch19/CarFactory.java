package javaStudyChapter1to2.ch19;

public class CarFactory {

    private static int serialNum = 10001;
    private static CarFactory instance = new CarFactory();

    private CarFactory() {

    }

    public static CarFactory getInstance() {
        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        car.setCarNum(serialNum);
        serialNum++;
        return car;
    }
}
