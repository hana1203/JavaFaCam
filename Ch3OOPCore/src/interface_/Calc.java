package interface_;

/*
Ch3-11. 구현코드가 없는 인터페이스
메서드 구현이 없는걸 뭐하는데 쓴데?
모든 메서드가 추상 메서드로만 되어있는 인터페이스.
인터페이스가 프로그램 설계에 어떤 의미가 있다. 인터페이스를 어떻게 쓰고 어떻게 구현하는지.

메서드 선언하면 기본적으로 메서드가 키워드 넣치않아도 public abstract 로 컴파일 된다.
모든 변수는 상수로 선언된다 - 추상클래스는 안에 변수 선언해도 나중에 인스턴스화 될 때 멤버변수로 쓰이지만
인터페이스는 구현코드가 없어서 안에 멤버변수를 가질 수 없다.
그 안에 변수로 선언되면 public static final 로 컴파일될때 상수화 된다.

상속은 이미 구현 코드를 상속 받는것
인터페이스는 구현코드가 없는 상태에서 클래스가 인터페이스를 구현한다. implement. 점선으로 표시.

 */
public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    //사칙연산하는 인터페이스의 메서드 정의
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //인터페이스는 상속이 아니라 구현한다고 표현.
}
