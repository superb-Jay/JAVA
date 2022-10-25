package javaJungSuck.interfaceFinal;

class A {
    public void method(I i) { // 인터페이스 I를 구현안 넘들만 들어와라
        i.method();
    }
}
//B클래스의 선언과 구현을 분리하여 클래스 A를 수정하지 않고 사용이 가능해졌다.
interface I {
    public void method();
}
class B implements I{
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C implements I{
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}
public class interfaceTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();// 두개세트         ㄱ
        a.method(b); // 아래랑 같은 코드   |  // A가 B를 사용(의존)
        a.method(new B()); // 하나로 줄이면 이렇게 됨
        a.method(new C()); // 클래스가 추가 되도 A를 더이상 수정하지 않고 추가가 가능해짐.
    }
}

/*
인터페이스의 장점.
개발시간을 단축할수 있다.
변경에 유리한 유연한 설계가 가능하다.
표준화가 가능하다.
관계없는 클래스들을 관계를 맺어줄수있다.
 */
