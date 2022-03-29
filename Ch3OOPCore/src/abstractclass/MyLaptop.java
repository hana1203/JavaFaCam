package abstractclass;

public class MyLaptop extends Laptop{
    //Laptop 에서 구현하지 않은 메서드가 한개 있다.
    @Override
    public void typing() {
        System.out.println("MyLaptop typing");
    }
}
/*
추상클래스는 왜쓰는가?
상속을 위해 만드는 클래스다. 추상클래스 안에 구현하는 메서드는 일부는 구현할수도있고 안할수도있다.
구현코드가 있는애들은 하위클래스에서 공통으로 쓸애들은 상위클래스에서 구현을 한다.
하위클래스에서 구체적으로 니들이 알아서 구현해 할 애들은 추상클래스 상태로 놔둔다.
메서드 다 구현을 했어도 (Desktop 처럼) 추상클래스로 두는 경우는 상속만을 하기위한 클래스.
인스턴스화해서 만들어서 쓸게 아니고 상속 기능하기위해서 추상클래스로 선언할수있다.
 */