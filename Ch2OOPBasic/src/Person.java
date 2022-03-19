// Ch2-11. 객체 자신을 가리키는 this
// 프로그래밍 하다보면 this 를 가끔 사용. c++, java 에 나오는 키워드
// this 는 인스턴스 자신의 메모리를 가리킨다.
// 객체를 new 하면 객체가 힙메모리에 생성되는데 이때 주소값 가지는 것이 참조변수. 그 값 자체를 참조값 reference value 라고한다.
// 변수는 인스턴스의 외부에 해당. 그 변수가 인스턴스를 가리키게됨. 인스턴스 자체 내부에서 자신의 주소값을 갖는게 this.
// case1.인스턴스 자신의 메모리를 가리킴
//public static void main(String[] args) {
//        Birthday bday = new Birthday();
//        bday 는 생성된 Birthday() 를 가리키는 참조변수
//        bday.setYear(2022);
//public void setYear(int year) {
//        this.year = year;
//        } 이때 year값 받아서 this.year에 year를 넣어준다. this 의 값이 heap 에 생성된 메모리의 값이다.

// case2.생성자에서 또 다른 생성자를 호출 할때 사용
// case3.자신의 주소(참조값)을 반환 함

public class Person {

    String name;
    int age;
//    외부에 오픈할 식별자가 없으니 그냥 default 로 놓음

    public Person() {
        // 생성자의 역할은 인스턴스를 초기화한다.
        // case2. 생성자에서 또 다른 생성자를 호출하는 this
        this("no name", 1);
        //this constructor 이 가장 첫번째 First statement 가 되야된다.
        //그 이전에 int num = 10; 이런 식으로 쓸 수 없다.
        // 밑의 생성자 호출이 끝나야 인스턴스 생성이 끝난다. 인스턴스 생성되기 이전에 다른 코드를 넣으면 오류가 나는것.
    }
//    default constructor
//    데이터 하나도 안들어온 생성자를 만드는데 아무런 값이 없으니 초기화를 시켜주고 싶다
//    this.name = "name 블라블라";
//    this.age = 1; 이런 식으로 초기화를 하려고하니 아래 생성자에 그 코드 그대로있음.
//    생성자에서 다른 생성자를 그대로 불러서 멤버변수 셋팅하는 일을 한다

    public Person(String name, int age) {
        // case3.자기자신의 address 를 나타내는 this
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name+" is " + age + "years old.");
    }

    public Person getPerson() { //getPerson() 메소드 만들고 반환 타입은 자기자신 Person
        // case3.자기자신의 주소를 반환하는 this
        return this;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.showPerson();
        System.out.println(p); //만들어진 참조변수 p를 출력
        //Person@279f2327 클래스의 풀네임과 instance address 출력됨.

        Person p2 = p.getPerson();
        System.out.println(p2);
        //Person@279f2327

    }
}

