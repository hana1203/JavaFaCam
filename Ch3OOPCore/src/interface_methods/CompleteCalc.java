package interface_methods;

public class CompleteCalc extends Calculator {
    //아까 Calculator 에서 구현하지못한 두개의 메서드 구현해라.
    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2==0)
            return ERROR;
        return num1/num2;
    }

    //추가적으로 메서드 만듬
    public void showInfo() {
        System.out.println("모두 구현했습니다");
    }

    //이미제공하고 있는 default 메서드를 재정의 할 수 있다.
    @Override
    public void description() {
        super.description(); //정수의 사칙연산을 제공합니다.
        // 상위클래스, 올라가서 인터페이스의 description 그대로 호출됨.
        System.out.println("CompleteCalc overriding");
    }
}
