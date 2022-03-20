public class NationTest {

    public static void main(String[] args) {
//        Nation taeyeon = new Nation();
//        taeyeon.setName("김태연");
//        System.out.println(taeyeon.nationNum);  //900000
//        Nation iu = new Nation();
//        iu.setName("아이유");
//
//        iu.nationNum++;
//        System.out.println(taeyeon.nationNum); //900001
//        System.out.println(iu.nationNum); //900001 이렇게 static변수에 변화주면 어떤 객체던지 똑같은 값 가진다.

        //국민이 태어날때마다 새로운 주민등록번호 부여하기 실행해보기 (생성자 추가 이후)
        Nation taeyeon = new Nation();
        taeyeon.setNationalName("김태연");

        Nation iu = new Nation();
        iu.setNationalName("아이유");

        System.out.println(taeyeon); //이름: 김태연 주민번호: 900001
        System.out.println(iu); //이름: 아이유 주민번호: 900002
//        System.out.println(Nation.nationNum); //900002
        //static변수는 인스턴스 참조변수말고 클래스이름으로 직접 참조할 수 있다. 이미 메모리에 올라와있을때 만들어진 변수라서.
        /////

//        Ch2-17. static 메서드의 활용을 위해 nationNum을 private 로 둔 이후.
//        private static int nationNum = 900000;
//        외부에서 사용하지 못하게 private 으로 막아두었기 때문에 Nation.nationNum 에 오류남.
        System.out.println(Nation.getNationNum());
    }
}
