package interface_;

public class CalculatorTest {
    public static void main(String[] args) {
        //CompleteCalc 클래스만 생성할 수 있다.
        //CompleteCalc 는 Calc 에서 상속받은건 아니지만 Calc 타입이 구현되어 있는것
        //type 상속을 했다. 구현 상속은 구현 코드를 받은것. 타입 상속은 이 클래스가 이 인터페이스 타입이다.
        //자바에서는 클래스간의 상속은 single inheritance 만 가능. 다중상속 못하는 거는 모호성 방지를 위해.
        //인터페이스 같은 경우는 구현코드가 없기때문에 여러개 구현해도 모호성 발생할 일이 없음.
        //클래스는 여러개의 인터페이스를 구현받을 수 있다. 다중 내포 가능.

        int num1=10;
        int num2=2;

        //인터페이스 구현과 형변환
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        /*
        상속에서의 형 변환과 동일한 의미
        클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있음 ( cf. extends)
        형 변환되는 경우 인터페이스에 선언된 메서드만을 사용가능함
         */

        //인스턴스 calc 는 CompleteCalc 로 생성을 했지만 타입을 Calc 로 했다
        //인스턴스 변수가 쓸 수 있는 메서드는 Calc 인터페이스에 선언된 메서드만 쓸 수 있다.

        CompleteCalc comcalc = new CompleteCalc();
        comcalc.showInfo();
        //CompleteCalc 에서 선언된 showInfo 메서드도 쓸 수 있다.

    }
}

/*
Ch3-12 인터페이스는 왜 쓰는가?
리모콘도 인터페이스가 됨. 티비와 사람을 연결. 연결점을 인터페이스라고 함
자바에서 인터페이스란? 구현하는 클래스나 프로그램이 제공하는 기능을 명시적으로 선언
이 클래스는~ 이 프로그램은~ 이 객체는~ 이 모듈은~ 제공을한다라는 게 인터페이스에 명세가 되어있다.
쓰는 쪽 프로그램은 클라이언트 프로그램. 프로그램 제공하는 모듈은 서버.
클라이언트 프로그램은 서버가 어떻게 구현되어있는지 알 필요없을 경우 많음
얘는 이렇게 구현되어있다고 선언되어있는 인터페이스만 보고 쓸 수 있다.
인터페이스를 구현한 클래스가 여러개 있을 수 있다. A B C 등등..
클라이언트 입장에서는 A B C 클래스를 쓰던 쓰는 방법은 바뀌지않는다.
어떤 메서들르 호출해서 어떻게 쓴다라는 인터페이스에 명시되어있는 방식은 똑같음

ex) JDBC 인터페이스
내 Java 프로그램 - 연결 - DB Oracle, MySQL, MSSQL
연결하려면 connection 이라는 객체 필요 - 구현코드 하나없는 인터페이스
connection 인터페이스가 해야될 일은 DB 회사들이 구현해서 jar 파일 -라이브러리 제공해준다.
우리는 소스 볼 필요없이 JDBC 명세만 보고 개발한다.

인터페이스가 하는 일은 이 모듈이 무슨일이 해야된다라는 걸 명세
쓰는 쪽은 어떻게 구현되어 있는지 알필요가없고 인터페이스만 보고 구현하면 된다.
인터페이스 설계하는게 중요하다.

하나의 구현한 인터페이스가 있으면 정책을 바꿔가면서 할수있다.
Strategy 패턴.
다형성이다. 정책을 바꿔가면서 할수있다.
인터페이스가 어떻게 다형성으로 활용 되는지에 대한 내용
똑같은 인터페이스를 활용해서 메서드 호출하지만 똑같은 코드가 여러가지 구현 implementation 가질 수 있다.
 */