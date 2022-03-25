package object_static;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        //private 으로 감춰져있는 인스턴스이니까 public 메서드로 불러오기
        //인스턴스가 static 이니 클래스 자체 가져와서 부르기. new 로 생성해서 인스턴스 참조변수로 쓰는게 아니고.
        Company company2 = Company.getInstance();
        //주소를 가져와보기 - JVM 이 할당해준 heap 메모리가 찍힌다.
        System.out.println(company1);
        System.out.println(company2);
//        object_static.Company@36baf30c
//        object_static.Company@36baf30c
//        정리하자면 object_static.Company 클래스는 외부에서 생성못하고 내부에 private으로 하나만 생성되있고 getInstance()메소드만 제공되서 메소드로만 사용 가능.

        Calendar calendar = Calendar.getInstance();
        //유일한 객체인 날짜 제공하는 java util 패키지의 Calendar 클래스. new 로 인스턴스 생성 못한다.

    }

}
