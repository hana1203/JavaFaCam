package inheritance_overriding;

public class CustomerVIP extends Customer {
    private int agentID;
    double discountRatio;

    //상위클래스에서 디폴트 컨스트럭터 말고 매개변수 받는 컨스트럭터 생성시
    public CustomerVIP(int customerID,String customerName) {
        super(customerID, customerName);
        //꼭 매개변수있는 생성자 만들필요는 없고 위의 디폴트 생성자에서
        //super(0, "noname"); 이렇게 생성해도 가능.
        customerGrade = "VIP";
        pointRatio = 0.05;
        discountRatio = 0.1;
    }

    //이제 VIP 클래스의 calcPrice 메서드는 구매가격에서 10% 할인된 가격을 나타내준다.
    //annotation 골뱅이. 이 주석이 있으면 문법적으로는 detect 되지않고 컴파일러에게 오버라이드된 메서드라고 알려주는 역할
    @Override
    public int calcPrice(int price) {
        point += price * pointRatio;
        price -= (int)price * discountRatio;
        return price;
    }

    public int getAgentID() {
        return getAgentID();
    }
}

