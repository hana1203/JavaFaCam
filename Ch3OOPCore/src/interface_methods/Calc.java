package interface_methods;

/*
Ch3-14. 인터페이스의 여러가지 요소
변수로 선언하지만 상수된다.
모든 메서드는 declaration 선언만 한다.
아무런 키워드 쓰지 않아도 public abstract 키워드 붙어 모두 추상 메서드가 된다.

디폴트 메서드
자바 8 이후 인터페이스에도 구현코드가 추가되게 됨.
인터페이스를 implementation 하는 클래스에서 같은 메서드를 계속 중복해서 구현해야되는 문제 발생.
이 인터페이스는 기본적으로 메서드는 기본적으로 제공한다 라고 하여 default 메서드 제공.
인터페이스를 implementation 하는 클래스에서 재정의 가능

정적 메서드
default 는 나중에 인터페이스를 구현하는 클래스가 있고 그 클래스가 new 된 이후에(인스턴스화 된 이후에) 호출해서 사용하는 메서드
static 이라는 키워드는 인스턴스 생성과 상관없이 쓸 수 있음
정적메서드 선언되어있으면 인터페이스에서는 이 메서드는 기본적으로 제공.
구현되지 않더라도 인터페이스 타입으로 직접 호출해서 사용 가능 하다.

private 메서드
인터페이스를 구현한 클래스에서 사용할수도 없고 재정의할 수 도 없다.
뭐하려고 제공하냐면.. 인터페이스 내부에서 default static 메서드를 구현할때 사용하기 위해서 제공.
 */

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    //사칙연산하는 인터페이스의 메서드 정의
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //default 메서드
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }

    //정수 array 가 들어오면 합쳐서 합을 반환해주는 static 메서드
    static int total(int[] arr) {
        int total =0;
        for (int num:arr) {
            total += num;
        }
        myStaticMethod();
        return total;
    }

    //private method
    //private 은 단지 인터페이스에서 제공하려고 사용
    //인터페이스 내에 구현. 구현 받은쪽에서 사용하는 것도 아니고 private 메서드는 재정의할 수 없다.

    //기본 private 메서드
    private void myMethod() {
        System.out.println("myMethod");
    }

    //static 에서 사용하는 private 메서드
     private static void myStaticMethod() {
         System.out.println("myStaticMethod");
    }
}
