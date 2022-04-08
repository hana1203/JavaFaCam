package interface_inheritance;

public interface Queue {
    //메서드 두개 만든다
    //책 들어가는 메서드, 책 이름을 가지고 들어가니 매개변수에 title 넣음
    void enQueue(String title);
    String deQueue();

    //Queue 안에 몇개 있는지 선언
    int getSize();
}
