package polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
        //ArrayList 로 커스터머 5명 생성하기
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer ed = new Customer(10001, "Ed");
        Customer taylor = new Customer(10002, "Taylor");
        Customer taeyeon = new CustomerGold(10003, "Taeyeon");
        Customer selena = new CustomerGold(10004, "Selena");
        Customer ariana = new CustomerVIP(10005, "Ariana");
//        System.out.println(customerList); // 비어있는 [] 출력된다.

/*
        //Ch3-8 다운캐스팅과 instanceof
        //instanceof 키워드 역할
        //이 변수가 원래 이 인스턴스의 타입이었냐? 인스턴스의 형 체크
//        CustomerVIP vc = (CustomerVIP) taeyeon; //컴파일 에러는 안남 인스턴스의 타입까지 알수는없다.
        //골드인데 vip로 캐스팅했으니 오류

        if (taeyeon instanceof CustomerGold) { //이 인스턴스가 Gold의 인스턴스이냐? 트루인 경우만 변환 하겠다
            CustomerGold vc = (CustomerGold)taeyeon;
            System.out.println(taeyeon.showCustomerInfo());
            //Taeyeon 님의 등급은 GOLD이며, 보유하고 계신 포인트는 0 입니다.
        }
 */

        customerList.add(ed);
        customerList.add(taylor);
        customerList.add(taeyeon);
        customerList.add(selena);
        customerList.add(ariana);

        System.out.println("===고객정보===");
        for (Customer customer:customerList) {
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println();
        System.out.println("===할인율과 포인트 계산===");
        int price = 10000;
        for (Customer customer:customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.customerName+" 님이 " +cost + "원 지불했습니다.");
            System.out.println(customer.customerName+ " 님의 현재 포인트는 "+ customer.point +"점 입니다.");
        }
    }
}

