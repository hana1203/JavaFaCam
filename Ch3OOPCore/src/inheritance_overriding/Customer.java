package inheritance_overriding;
//상속의 클래스 생성과정
//하위클래스만 생성해도 어떻게 상위클래스의 멤버변수, 메서드 호출해서 쓸수있는지
//하위클래스 생성하면 항상 상위클래스가 먼저 생성이된다.
public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int point;
    double pointRatio;

    //default constructor 말고 생성시 customerID, 이름 매개변수로 받는 constructor 를 만들고 싶을때
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "NORMAL";
        pointRatio = 0.01;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int calcPrice(int price) {
        point += price * pointRatio;
        return price;
    }

    public String showPoint() {
        return "포인트는" + point + "입니다.";
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보유하고 계신 포인트는 " + point + " 입니다.";
    }



}
