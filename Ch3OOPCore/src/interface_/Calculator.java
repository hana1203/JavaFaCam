package interface_;

public abstract class Calculator implements Calc {
    //Cacl 구현받는 너가 abstract 되거나 모든 메서드를 구현해라
    //구현하지 않은 메서드를 2개 포함하게 만들것

    public int add(int num1, int num2) {
        return num1+num2;
    }
    public int subtract(int num1, int num2) {
        return num2-num1;
    }

}
