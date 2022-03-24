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
//        taylor.point(1000); //에러 Customer클래스의 default 멤버변수인데 왜 상속 클래스에서 쓰면 에러???
        //변수니까 메소드가 아닌 변수로 저장해줘야됨
        taylor.point = 1000;
        taylor.calcPrice(50000);
        System.out.println(taylor.showCustomerInfo());
    }
}
