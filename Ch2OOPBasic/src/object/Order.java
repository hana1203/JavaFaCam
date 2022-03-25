package object;

public class Order {
    public long orderN;
    public String phoneN; //정수형으로 표현하면 010 0이 안찍힘
    public String address;
    public int date;
    public String time;
    public int cost;
    public String menuN;

    public void printOrder() {
        System.out.println("음식점에 배달 주문이 들어왔습니다 ");
        System.out.println("주문번호: "+orderN);
        System.out.println("주문 핸드폰번호: "+phoneN);
        System.out.println("주문 집주소: "+address);
        System.out.println("주문 날짜: "+date);
        System.out.println("주문 시간: "+time);
        System.out.println("주문 가격: "+cost);
        System.out.println("메뉴 번호: "+menuN);
    }
}
