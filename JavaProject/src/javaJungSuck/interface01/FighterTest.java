package javaJungSuck.interface01;

abstract class Unit {
    int x,y;
    abstract void move (int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}
interface Fightable {
    void move(int x, int y); // public abstact가 생략되어잇음 "인터페이스니까!!"
    void attack(Fightable f); // public abstact가 생략되어잇음 "인터페이스니까!!"
}

class Fighter extends Unit implements Fightable {

    @Override
    //오버라이드 규칙 : 조상보다 접근제어자가 범위가 좁으면 안된다. 인터페이스를 구현 인터페이스는 public  그러므로 구현도 publci
    public void move(int x, int y) {
        System.out.println("]" + x +","+ y + "]로 이동");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }

    public Fightable getFightable() {
        Fighter f = new Fighter();
        return f;
    }
}

public class FighterTest {

    public static void main(String[] args) {
//        Fighter f = new Fighter();
//        Unit f = new Fighter(); // 다형성으로 가능하지만 Unit 에는 attack 메서드가 없다.
        Fightable f = new Fighter(); // 다형성으로 가능함 역시 Fightable이 가지고있는 메서드만 가능.

        f.move(100,200);
        f.attack(new Fighter());

    }

    /*
    인터페이스의 장점.
    두 대상간의 연결, 대화, 소통을 돕는 중간 역활을 한다.
    컴퓨터 직접사용 -> 컴퓨터 GUI 그래픽유저인터페이스 윈도우 설치후 사용. 차이. 변경의 유리하다.(컴퓨터를 막바꿈)
    선언과 구현을 분리시킬수 있게 한다.
     */
}
