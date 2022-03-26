package polymorphism;
//새로 요구사항 생겨서 Gold 등급 커스터머 생겨났을때
//고객이 늘어 일반 고객보다는 많이 구매하고 VIP보다는 적게 구매하는 고객에게도 해택
//GOLD 고객 등급을 만들고 혜택은 다음과 같다
//제품을 살때는 10프로를 할인해준다
//보너스 포인트는 2%를 적립해준다

public class CustomerGold extends Customer{
    double discountRatio;

    public CustomerGold(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "GOLD";
        pointRatio = 0.02;
        discountRatio = 0.1;
    }

    public int calcPrice(int price) {
        point += price * pointRatio;
        price -= (int)price * discountRatio;
        return price;
    }
}
