package javaJungSuck.interface0;

/*
 인터페이스 = 추상메서드의 집합.
 구현된것이 전혀 없는 설계도, 껍데기 (모든멤버가 public static final)

 인터페이스와 추상클래스의 차이
 기본적으로 공통점은 추상메서드를 가지고 있다는 것.
 다른점은 인터페이스는 추상메서드만 가지고 있고, 자바 1.8부터는 디폴트메서드, 스테틱메서드, 상수가 추가 되엇따.
 추상클래스는 일반 클래스인데 추상 메서드를 포함 생성자 멤버변수 등을 가지고있다.

 */

public interface PlayingCard {

    public static final int SPADE = 4;
    final int DIAMOND = 3; // public static final int 가 생략되어있음.
    static int HEART = 2; // public static final int 가 생략되어있음.
    int CLOVER = 1; // public static final int 가 생략되어있음.

    abstract String getCardNumber();  //
    String getCardKind(); // public abstract가 생략 되어있다.

    //인터페이스는 미완성 미구현 설계도 , 구현된것이 전혀 없다.
    //그렇기 때문에 모든 상수는 public static final 이고
    //모든 메서드는 public abstract 이다.
    //그렇기 때문에 생략이 가능하다.

    // 인터페이스의 조상은 클래스와는 다르게 Object가 최고 조상이 아니다.
    // 인터페이스의 조상은 인터페이스만 가능하고
    // 다중상속이 가능한것이 장점. (조상이 여러개)
    // 선언부가 같고 내용이 다르면 어느것을 상속받아야될지 모르겟지만
    // 추상메서드는 충돌해도 문제가 없음 이유는 전부 미구현 메서드이기 떄문에.

    //인터페이스의 다형성 가능. (조상타입 참조변수로 자손객체를 가르키는것)
    //단, 인터페이스에 있는 메서드만 사용이 가능함. (조상타입에 있는 것만 가능하다는것과 같은 맥락)
    //매개변수타입이 인터페이스라는 것은 매개변수로 선언된 인터페이스를 구현한 클래스의 인스턴스만 들어올수있다는 말임.
    // 메서드의 리턴타입이 인터페이스라는 것은 리턴타입으로 선언된 인터페이스를 구현한 클래스의 인스턴스만 반환할수 있다는 말.




}
