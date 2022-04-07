package interface_methods;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1=10;
        int num2=2;

        //인터페이스 구현과 형변환
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.description(); //정수의 사칙연산을 제공합니다.

        //total 정적메서드 가져다쓰기
        //인스턴스 생성과 상관없이 쓸 수 있으므로 인스턴스 구현된 거 주석처리 하고 써도 무방
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr)); //정적메서드 니까 인터페이스 이름으로 바로 호출




    }
}
