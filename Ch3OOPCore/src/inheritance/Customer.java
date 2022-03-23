package inheritance;

public class Customer {

//    private int customerID;
//    private String customerName;
//    private String customerGrade;
//    int bonusPoint;
//    double bonusRatio;
    //패키지 default 로 둠. 외부패키지에선 접근 못하니까 어느정도 hiding 됨. 여러가지 사용해보려고 private 없이 디폴드값으로.

//    private  접근제어자는 외부클래스에서는 아무도 접근 못함.
//    상속관계에서는 상위클래스의 멤버변수 받아서 하위클래스에서도 사용할일이 많음.
//    상위클래스에서 하위클래스만 접근가능해주고 외부클래스에서는 접근할 수 없도록 protected 라는 접근제어자 쓴다.

    //상속하면서 접근제어자 바꿔줌.
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int point;
    double pointRatio;

    //생성자 만들어서 초기화
    //인스턴스별로 다르면 매개변수로 받으면서 초기화.
    public Customer() {
        customerGrade = "NORMAL";
        pointRatio = 0.01; //일반 고객의 경우 모두 적립 포인트에 대한 비율이 똑같으니 그냥 생성자에서 만듬.
    }

    public int getCustomerID() {
        return customerID;
    }

    public int calcPrice(int price) {
        point += price * pointRatio;
        return price;
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
