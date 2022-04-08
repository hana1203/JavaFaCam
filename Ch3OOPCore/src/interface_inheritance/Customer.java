package interface_inheritance;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("Customer buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    @Override
    public void order() {
        //Buy.super.order(); //Buy 인터페이스의 order() 메서드 쓰겠다
        System.out.println("Customer order");
    }

    //Customer 에서쓰는 method 하나 아무거나 만들기
    public void hello() {
        System.out.println("hello");
    }
}
