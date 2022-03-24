package inheritance_super;

public class CustomerVIP extends Customer {
    private int agentID;
    double discountRatio;

    /*
    default 생성자
//    public CustomerVIP() {
//        customerGrade = "VIP";
//        pointRatio = 0.05;
//        discountRatio = 0.1;
//        System.out.println("CustomerVIP() called");
//    }
        VIP 에는 아무곳에도 코드가없는데 어떻게 Customer() 생성자가 호출되는가?
        상속을 받은 경우에는 클래스 생성자가 상위클래스의 constructor 를 호출해야된다.
        호출해야되는 코드가 없으면 컴파일러가 자동적으로 super() 를 넣어준다.
        super();
        this 키워드는 인스턴스가 자기자신의 주소를 가지고있을때 클래스가 생성된 인스턴스 자기자신의 주소를 가지고있는 값이 this 이다.
        this 의 또다른 기능중에 자기 클래스의 다른 생성자를 호출할 수 있는 기능이있다.
        super 키워드는 하위클래스가 상위클래스 인스턴스의 참조값을 가지게 된다.
        this 와 마찬가지로 생성자를 호출할 수 있는 기능이 있다.
        아무것도 안들어가 있을때는 default 생성자가 호출이 되는것. 내가 생성자 호출하는 코드 하나도 안써도 컴파일러가 넣어준다.
        컴파일러가 default constructor 넣어주듯이 상위 클래스 생성자 호출하는 코드 하나도 없어도 super 키워드 자연적으로 넣어준다.
        그럼 Customer() 의 default constructor 가 호출된다.
    */

    //상위클래스에서 디폴트 컨스트럭터 말고 매개변수 받는 컨스트럭터 생성시

    public CustomerVIP(int customerID,String customerName) {
        super(customerID, customerName);
        //꼭 매개변수있는 생성자 만들필요는 없고 위의 디폴트 생성자에서
        //super(0, "noname"); 이렇게 생성해도 가능.
        customerGrade = "VIP";
        pointRatio = 0.05;
        discountRatio = 0.01;

        System.out.println("CustomerVIP(int, String) called ");
    }

    public int calcPrice(int price) {
        point += price * pointRatio;
        price += price - (price * discountRatio);
        return price;
    }

    public int getAgentID() {
        return getAgentID();
    }
}

