package inheritance_super;

public class CustomerTest {

    public static void main(String[] args) {
        //매개변수 넣은 constructor 일때
        Customer alicia = new Customer(1000, "앨리샤");
        System.out.println(alicia.showCustomerInfo());

        CustomerVIP taylor = new CustomerVIP(1001, "테일러");
        taylor.point = 1000;
//        taylor.showPoint(); //왜 출력안됨?
        System.out.println(taylor.showPoint()); //이렇게 해야지 출력되네
        taylor.calcPrice(50000); //5만원짜리 물건사서 쌓인 포인트 2500
        System.out.println(taylor.showCustomerInfo());

        //형변환 업캐스팅
        Customer customer = new CustomerVIP(1234, "noname");
    }
}
/*
정리
하위클래스 생성될때 항상 상위클래스가 먼저 생성이된다.
상위, 하위클래스 모두 default constructor 아무것도 없으면 양쪽다 default constructor 추가되면서
하위에서 super 를 호출한다.
그런데, 컴파일러가 자동적으로 호출해줄 수 있는 constructor 가 존재하지않으면, ex) 매개변수 있는 생성자의 경우, 직접 명시적으로 호출해야된다.
 */