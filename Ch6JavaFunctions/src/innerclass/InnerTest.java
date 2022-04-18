package innerclass;
/* 01 여러 내부 클래스의 정의와 유형
01.
내부 클래스
클래스 내부에 클래스 선언하는것
클래스 내부에서만 쓸려고, 외부에서 사용할일 없는 클래스
익명 내부클래스를 가장 많이 활용함.
인스턴스 내부클래스, 정적 static 내부 클래스, 지역 local 내부 클래스 , 익명 anonymous 내부 클래스
변수도 멤버변수, static 변수, 함수안에서 쓰는 로컬 변수가 있듯이 익명 내부 클래스 빼고는
변수의 선언위치나 생성주기가 똑같음
익명 내부클래스는 이름이 없음 변수에는 없는 내용이지만 가장많이 활용.
 */

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass(); //아우터 클래스 먼저 만들어지고 이너클래스가 만들어짐
    }

    class InClass{
        int inNum = 100;
        static int sInNum = 500;
        // 인스턴스 내부에서는 정적변수 사용 못한다. 정적 변수 사용하려면 정적 내부 클래스에서 사용해야된다.

        void inTest() {
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    //내가 만든 이너클래스의 메서드를 여기서 호출
     public void usingClass() {
        inClass.inTest();
    }

    //정적내부클래스
    static class InStaticClass {
        int iNum = 100;
        static int sInNum =200;

        void inTest() {
            System.out.println("InClass num = " +iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
        }
        static void sTest() {
//            System.out.println("OutClass num = " +iNum + "(외부 클래스의 인스턴스 변수)");
            //내부클래스의 인스턴스 변수 못쓴다. 스태틱 클래스의 스태틱 메서드는 클래스 생성과 관계없이 호출될 수 있어야되는데
            //그때 iNum 이라는 변수가 생성이 안되어있을 수 도있다.
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");

        }


    }
}

public class InnerTest {
    public static void main(String[] args) {
        //정석
        OutClass outClass = new OutClass();
        outClass.usingClass();

        //private 아닌경우 내부에서도 생성가능
        OutClass.InClass inner = outClass.new InClass();
        inner.inTest();

        //static
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        //static method 는 바로 호출 가능
        OutClass.InStaticClass.sTest();

    }
}
