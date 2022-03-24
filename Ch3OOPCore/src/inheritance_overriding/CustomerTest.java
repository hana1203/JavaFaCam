package inheritance_overriding;

public class CustomerTest {

    public static void main(String[] args) {
        //매개변수 넣은 constructor 일때
        Customer alicia = new Customer(1000, "앨리샤");
        System.out.println(alicia.showCustomerInfo());
        int price = alicia.calcPrice(10000);
        System.out.println("앨리샤의 구매가격: "+price);

        CustomerVIP taylor = new CustomerVIP(1001, "테일러");
        taylor.calcPrice(50000); //5만원짜리 물건사서 쌓인 포인트 2500
        System.out.println(taylor.showCustomerInfo());
        price = taylor.calcPrice(10000);
        System.out.println("테일러의 구매가격: "+price);

        //형변환 업캐스팅
        Customer vc = new CustomerVIP(1234, "noname");
        /*
        VIP 로 생성을 했지만 Customer 타입으로 대입. 형변환.
        인스턴스는 VIP 로 생성이되었지만 타입은 Customer 이기때문에 멤버변수는 모두 Customer 것만 사용가능.
        VIP 것 다쓰고싶으면 ? 다시 다운캐스팅하거나 재정의 오버라이딩 활용해서 사용.
        변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer 의 변수와 메서드임
        생성은 다 가능하지만 상위클래스 형으로 변환된 경우에는 상위클래스에서 선언된 요소들만 사용가능.
         */

        /*
        VIP 커스터머로 생성을 하고 Customer 타입으로 대입한 이 vc 는 얼마 지불해야되나?
        가상함수와 형변화, 재정의 같이 얘기하는 것
        calcPrice 는 재정의된 메서드가 있고 VIP 클래스에서 재정의.
        인스턴스는 VIP 이고, vc 변수 타입은 Customer 이다.
         */
        System.out.println(vc.calcPrice(10000)); //VIP 지불가격인 9000 이 불린다.
        /*
        인스턴스의 메서드가 호출되었다.
        가상함수 방식. 자바에서는 가상메서드라고 부름
        형변환이 되었을때 가상메서드가 호출이 된다. 실제 인스턴스의 메소드가 호출이 된다.
        자바의 모든 메서드는 가상메서드 virtual method 이다.
         */
    }
}


/*
메서드 재정의와 가상메서드의 원리
메서드, 함수 호출이 어떻게되는지
a() 함수
int 변수
instruction set 여러가지 명령어들

함수 a() 호출하면 프로그램이 실행되어 메모리에 올라간다.
메모리에 올라가면 두가지 영역으로 나뉜다.Code 영역, Data 영역
Code 영역 - 프로그램의 메서드가 들어간다.
두 개의 인스턴스의 변수는 달라서 변수영역은 따로 잡힌다.
지역변수는 stack 에 인스턴스의 경우엔 heap 메모리에 잡힌다.
인스트럭션 기능은 인스턴스마다 다르지 않다.
인스터럭션 set 은 코드 영역에 잡힌다. 함수이름은 나중에 어드레스로 잡힌다. 함수 이름은 일종의 주소.
함수가 호출이 된다는 것은 instruction set 부분이 호출이 되는 것이다.
인스턴스마다 수행하는 기능의 set 은 따로따로 생기지 않는다.
변수가 차지하고 있는 영역과 함수의 instruction set (명령어 집합)이 차지하고 있는 영역은 다르다.
*/

/*
가상메서드(가상함수)의 개념
자바는 모든메서드가 가상함수이다. 특별히 명시하지 않아도 가상 함수 방식으로 이뤄진다.
함수이름으로 호출되는게 아니고 함수이름이 가르키는 virtual method table 테이블이 있다.
각 클래스마다 자기 메서드의 주소를 가지고있다.

vc.calcPrice();
vc 변수가 calcPrice() 함수 호출시
함수가 생성된 인스턴스쪽 (VIP 클래스)에서 함수가 재정의가 되었을때
-calcPrice() 가 재정의 된경우?
재정의한 VIP 클래스의 calcPrice() 호출
-calcPrice() 가 재정의 안된경우?
원래 함수 Customer 클래스의 calcPrice() 가 호출된다.

맥락을 쭉 이해해야된다.
상속
형변화 - 상위클래스로 형이 대입된다
메서드 재정의 - 상위클래스에있는 메서드인데 하위클래스에서 자기랑 안맞으면 재정의할 수 있다.
가상함수 테이블 - 인스턴스의 재정의된 메서드가 불리는 오버라이딩, 가상함수(메서드)
이 개념을 바탕으로 다형성을 배운다. 다른 클래스 타입을 가졌지만 동일하게 코드를 호출해도 다양한 구현결과가 나온다.
다형성의 구현으로 얼마나 flexible 한 프로그램 구현이 가능한지 살펴본다.
 */
