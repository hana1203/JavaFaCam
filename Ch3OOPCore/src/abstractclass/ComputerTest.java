package abstractclass;

public class ComputerTest {
    //MyLaptop 와 Desktop 추상메서드를 포함하지않는 구현된 클래스
    //Computer Laptop 은 추상메서드를 포함한 클래스
    //추상메서드를 포함한 추상클래스는 인스턴스화 할수없다.
    //new 해서 Computer new 해서 display 호출해도 display 에 대한 구현코드가 없어서 실행될 부분이 없다.
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        Computer desktop1 = new Desktop();
        desktop.display();
        desktop1.display();
    }
}
