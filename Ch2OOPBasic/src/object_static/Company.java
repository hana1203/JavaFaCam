package object_static;

// Ch2-18. Static 응용 - 싱글톤 패턴
// 객체지향 디자인 패턴 중 하나
// 대부분 프로그램은 클래스에대해 인스턴스가 여러개인 경우가 많고 인스턴스는 멤버변수가 여러가지 값가짐.
// 하지만 이런 경우 문제가 되는 경우가 있다.
// 프로그램에서 인스턴스가 단 한개만 생성되어야하는 경우
public class Company {
    //하나의 회사. 유일해야 된다. 하나의 인스턴스만 존재하게 둔다.
    //코드에서 생성자 제공안하면 컴파일러가 default 생성자를 만들어준다.
    //외부에서 디폴트 생성자는 public으로 제공되기때문에 외부에서 컴퍼니를 여러개 생성할 수 있다.

    private static Company instance = new Company();
    private Company() {
    }
    //유일한 객체를 만든것

//    유일한 인스턴스를 접근하기 위한 public 메소드를 만들어주기
//    일반 메소드일 경우 인스턴스 생성하고 메소드 호출가능하니까 외부에서 클래스이름으로 호출하여 사용하려면 static 으로 선언
    public static Company getInstance() {
        //혹시라도 instance 가 null 일 경우를 대비한 방어적인 코드
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
