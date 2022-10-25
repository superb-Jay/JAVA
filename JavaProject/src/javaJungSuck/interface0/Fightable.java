package javaJungSuck.interface0;

public interface Fightable extends Moveable , Attackable {
    // 인터페이스의 조상은 클래스와는 다르게 Object가 최고 조상이 아니다.
    // 인터페이스의 조상은 인터페이스만 가능하고
    // 다중상속이 가능한것이 장점. (조상이 여러개)
    // 선언부가 같고 내용이 다르면 어느것을 상속받아야될지 모르겟지만
    // 추상메서드는 충돌해도 문제가 없음 이유는 전부 미구현 메서드이기 떄문에.

    // 인터페이스에 정의된 추상메서드를 완성하는것 "구현" implements
}

interface Moveable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}

// 인터페이스에 정의된 추상메서드를 완성하는것 "구현" implements
abstract class Unit implements Moveable,Attackable { // 다중으로 구현이 가능함.
                                            // Unit 클래스는 Moveable, Attackable 인터페이스를 구현했다.

    @Override
    public void move(int x, int y) {

    }

//    @Override
//    public void attack(Unit u) { // 만약에 두개중에 1개만 구현될경우 abstact 키워드가 필요함.
                                    // 미완성이라고 알려줘야 함.
//
//    }
}
