package object;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderN = 220318104;
        order.phoneN = "01040000000";
        order.address = "서울시 서대문구 홍익대 BongKyo베이커리";
        order.date = 20220318;
        order.time = "1520";
        order.cost = 39000;
        order.menuN = "005";
        order.printOrder();
    }

}
