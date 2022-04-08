package interface_inheritance;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("Snoopy1");
        bookQueue.enQueue("Snoopy2");
        bookQueue.enQueue("Snoopy3");

        System.out.println(bookQueue.getSize()); //3
        System.out.println(bookQueue.deQueue()); //Snoopy1
        System.out.println(bookQueue.deQueue()); //Snoopy2
        System.out.println(bookQueue.deQueue()); //Snoopy3
    }
}

/*
우리가 어떤 클래스 생성할때 이미 잘 만들어진 자기 보다 일반적인 클래스에서 상속을 받고
자기가 구현해야될 기능이 선언되어있는 인터페이스를 구현하는 구조로 많이 사용한다.
 */