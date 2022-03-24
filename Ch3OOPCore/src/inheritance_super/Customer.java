package inheritance_super;
/*
상속의 클래스 생성과정
하위클래스만 생성해도 어떻게 상위클래스의 멤버변수, 메서드 호출해서 쓸수있는지
하위클래스 생성하면 항상 상위클래스가 먼저 생성이된다.
 */
public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int point;
    double pointRatio;

    /*
    생성자 만들어서 초기화 시키기.
    인스턴스별로 다르면 매개변수로 받으면서 초기화.
     */
//    public Customer() {
//        customerGrade = "NORMAL";
//        pointRatio = 0.01; //일반 고객의 경우 모두 적립 포인트에 대한 비율이 똑같으니 그냥 생성자에서 만듬.
//        //클래스가 호출될때 출력되는 로그
//        System.out.println("Customer() called");
//    }

    //default constructor 말고 생성시 customerID, 이름 매개변수로 받는 constructor 를 만들고 싶을때
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "NORMAL";
        pointRatio = 0.01;
        System.out.println("Customer(int, String) called ");
    }
    /*
    하위클래스에서 오류가 난다. 내가 명시적으로 상위클래스 생성자 호출해주어야된다. 그 이전에는 컴파일러가 자동적으로 넣어줘서 호출이 되었지만
    지금은 호출될수 있는 constructor 가 없기 때문에 내가 직접 호출 시켜야됨.
    */

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
