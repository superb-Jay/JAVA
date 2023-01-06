package javaJungSuck.abstract0;
/*
추상클래스를 작성하는 이유는 자주 사용하게 될거 같은 멤버들을 추상클래스로 선언해두면
상속받아서 계속 작성하면서 코드중복을 막을수 있다.
클래스의 빠른 설계가 가능.
중간중간 추상클래스 의미있는 단계별로 잘 만들어놓는것이 능력. ㅡ> 점점 구체적으로 추상클래스를 작성.

추상화(명확하지 않음)의 반댓말은 구체화.(구체적)

 */

public class Ex7_10 {
    public static void main(String[] args) {
//        Unit[] group = {new Marine(),new Tank(),new DropShip()};
        //같은코드
        Unit[] group = new Unit[3]; // 객체배열은 참조변수를 묵은것.
//        Object[] group = new Object[3];   //모든 클래스는 오브젝트 클래스를 상속받으니 다형성을 활용하여 Unit을 Object로 변경?
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new DropShip();
        // 유닛타입 배열의 그룹 , 마린,탱크,드롭십은 유닛을 상속받고 있기 때문에 가능.

        //Object로 변경해도 상관없지만 그러면 오브젝트클래스에는 Move라는 메서드가 없어서 에러가 남.
        //"다형성" 조상타입의 참조변수로 자손타입의 객체를 다루는것. 조상타입리모콘에 Move가 없으면 사용할수 없다는뜻.

        for (Unit unit : group) {
            unit.move(100,200);
        }
    }
}

abstract class Unit {
    int x,y;
    abstract void move(int x, int y);
    void stop() {};
}
class Marine extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" +y+"]");
    }
    void strimPack() {
        System.out.println("스팀팩을 사용한다.");
    }
}

class Tank extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" +y+"]");
    }

    void changeMode() {
        System.out.println("공격모드를 변환한다.");
    }
}

class DropShip extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("DropShip[x=" + x + ",y=" +y+"]");
    }
    void load() {
        System.out.println("선택된 대상을 태운다.");
    }
    void unload() {
        System.out.println("선택된 대상을 내린다.");
    }
}