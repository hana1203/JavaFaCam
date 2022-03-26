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

        customerList.add(ed);
        customerList.add(taylor);
        customerList.add(taeyeon);
        customerList.add(selena);
        customerList.add(ariana);
        System.out.println("===고객정보===");
        for (Customer customer:customerList) {
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("===할인율과 포인트 계산===");
        int price = 10000;
        for (Customer customer:customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.customerName+" 님이 " +price + "원 지불했습니다.");
            System.out.println(customer.customerName+ " 님의 현재 포인트는 "+ customer.point +"점 입니다.");
        }
    }
}

