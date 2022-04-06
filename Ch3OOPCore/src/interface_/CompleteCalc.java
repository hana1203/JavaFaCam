package interface_;

public class CompleteCalc extends Calculator{
    //아ㄷ까 Calculator 에서 구현하지못한 두개의 메서드 구현해라.
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


}
