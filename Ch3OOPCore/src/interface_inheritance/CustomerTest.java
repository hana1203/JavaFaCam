package interface_inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy(); //Customer buy
        customer.sell(); //Customer sell
        customer.order(); //Customer order
        customer.hello(); //hello

        //업캐스팅
        //상위클래스 타입으로 묵시적으로 형변환되는 것
        Buy buyer = customer;
        buyer.buy(); //Customer buy
        buyer.order(); //Customer order
        //사용 가능한 메서드는 Buyer 인터페이스에 선언된 buy() order() 만 사용 가능.
        //재정의 한 메서드는 재정의 한걸  로 호출.

        Sell seller = customer;
        seller.order(); //Customer order
        //sell order 로 호출이 안되는 이유 ?
        //Customer 쪽에서 재정의했기때문에 virtual method 에 의해 재정의된 메서드가 호출된다.
        seller.sell(); //Customer sell

    }

}
