package interface_inheritance;

public interface Sell {
    void sell(); //메서드 선언
    //default 메서드 제공
    default void order() {
        System.out.println("sell order");
    }
}
