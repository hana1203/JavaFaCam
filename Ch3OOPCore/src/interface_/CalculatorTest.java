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
