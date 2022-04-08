package interface_inheritance;

//Ch3-15 여러 인터페이스 구현하기, 인터페이스의 상속
/*
인터페이스와 클래스 같이 상속받아서 구현하는 경우가 많다
클래스만들다보면 기존 클래스 상속받고 여러개 인터페이스 상속받는 경우가 있다.
자바는 클래스간의 다중상속은 되지않는다.
기존 자바의 설계사상: 기능이 많아지고 좋아지는 것보다는 안전하고 모호하지 않은 방향으로 설계
인터페이스는 구현코드가 없기때문에 여러가지 인터페이스를 구현받아서 쓸수있다.
기능추가되어 구현코드 default , static 메서드가 들어가는 경우가 있다.

 */
public interface Buy {
    void buy();

    default void order() {
        System.out.println("buy order");
    }
}
