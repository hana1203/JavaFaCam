package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer alicia = new Customer();
        alicia.setCustomerName("앨리샤");
        alicia.setCustomerID(1000);
        alicia.point = 1000;
        System.out.println(alicia.showCustomerInfo());

        CustomerVIP taylor = new CustomerVIP();
        taylor.setCustomerName("테일러");
//        taylor.bonusPoint(1000); 에러
        taylor.calcPrice(50000);
        System.out.println(taylor.showCustomerInfo());
    }
}
