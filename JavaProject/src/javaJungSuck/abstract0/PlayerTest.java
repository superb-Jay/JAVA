package javaJungSuck.abstract0;
/*
추상클래스의 활용.
여러클래스에 공통적으로 사용될수 있는 추상클래스를 바로 작성하거나
기존 클래스의 공통부분을 뽑아서 추상클래스를 만든다.
 */


abstract class Player{ // 추상클래스 (미완성 클래스, 미완성 설계도)
    abstract void play(int pos); // 추상메서드 미완성 메서드
    abstract void stop(); // 추상메서드 선언부만 있고 구현부가 없는 메서드
}
// 추상클래스는 상속을 통해 완성해야 객체 생성이 가능하다.
class AudioPlayer extends Player {
    @Override
    void play(int pos) {
        System.out.println(pos + "위치부터 플레이 합니다.");
    }

    @Override
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
    void gogo() {
    }
}

abstract class DvdPlayer extends Player { // 추상클래스를 상속받았지만 모든 추상메서드를 구현하지 않았다면.
                                        // abstract 키워드를 클래스명 앞에 붙여서 미완성 클래스라고, 구현되지 않은 메서드가 있다고
                                        // 알려줘야 한다.
    @Override
    void play(int pos) {

    }
}
public class PlayerTest {

    public static void main(String[] args) {

        //    Player p = new Player(); // 추상클래스는 객체생성이 안된다.
        AudioPlayer ap = new AudioPlayer(); // 추상클래스 플레이어를 상속받은 오디오 플레이어에
        // 추상메서드가 "모두" 구현 되엇기에 객체 생성이 가능해졋음.
        ap.play(100); // 추상클래스 플레이어에서 상속받은 추상메서드를 구현완료.
        ap.stop();  // 추상클래스 플레이어에서 상속받은 추상메서드를 구현완료.
        ap.gogo(); // 조상클래스 플레이어에 없는 오디오 플레이어만의 메서드

        Player ap1  = new AudioPlayer(); // 조상타입의 참조변수로 자손타입의 객체를 다루는것 (다형성)
                                        // 플레이어타입의 리모콘으로 상속받아 구현이 완료된 오디오 플레이어클래스를 조종가능.
                                        // 오디오플레이어에 구현된 메서드가 조상타입에 없는것은 안됨.
        ap1.play(100);
        ap1.stop();
//        ap1.gogo();                   // 오디오플레이어 클래스에만 있는 메서드는 조상타입의 플레이어 참조변수로 접근이 안됨.
    }


}
