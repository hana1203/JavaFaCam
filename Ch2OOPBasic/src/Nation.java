// Ch2-16. Static 변수. 여러 인스턴스에서 공통으로 사용하는 변수
// 인스턴스 new로 생성되면 힙메모리에 하나의 인스턴스에 대한 메모리가 생성된다.
// f.e. 인스턴스 Student에 대한 id, name 속성값 메모리는 따로 생성이 된다.
// 그런데 동일한 클래스 내에서 공유하는 기준값이 필요한 경우가 있다. 인스턴스1도 쓰고 2도쓰고. 여러 인스턴스가 그 값을 업데이트 할수도있고 불러올수도있고.
// 일반 멤버변수로 하면 인스턴스 마다 생성이 되므로 -> static 변수를 써야된다. 여러개의 인스턴스가 공유할 수 있는 변수.
// 각각 인스턴스에 새로 부여해줄 번호의 기준이 되는 값이 필요할 때. 기준되는 값을 통해 원하는 값을 만들어낼 수 있다.
// ex) 학번, 사번, 시리얼넘버, 카드번호 .. 중복되지 않는 순차적인 값

// static 변수는 언제만들어지는가?
// 프로그램 구동시키면 메모리에 올라간다. 메모리에 올라갔을때 상태가 프로세스.프로세스가 도는게아니고 thread가 돌게됨.
// 메모리에 올라갈때 프로그램은 두가지 영역이 있다.
// Data영역(=Static영역 =상수영역) -처음 메모리에 로딩이 될때 처음부터 메모리를 잡는 데이터들. constant, literal, static 변수들이 Data 영역에 올라간다.
// Code 영역 - 명령어 instruction set 집합. line by line 수행.

// 인스턴스 생성될때마다 사용하는 메모리는 Heap 메모리. 동적 메모리.
// 인스턴스가 생성되었다가 사라지는 순간 Garbage collector에 의해 메모리가 수거가된다.
// Static 변수는 사용하는 메모리공간이 다르다. Data영역에 생성된다.
// 프로그램이 프로세스되서 메모리에 로딩되는 순간 데이터영역에 잡히고 이 프로그램이 다 끝나서 메모리에서 언로드되어야지 없어진다.
// 인스턴스 생성과 상관없이 사용가능하므로 클래스이름으로 참조.

public class Nation { //국민을 객체로 만들어봄
    // Ch2-16. Static 변수.
    //    static int nationNum = 900000;
    //온 국민이 공통으로 가지고있는 주민등록번호 13자리이니까 static int로 두었다. 지금은 13자리가 int에 안담기니 편의상 앞자리만 표현.

    //Ch2-17. static 메서드의 활용.
//    nationNum 는 중요한 변수. 기준이되는 변수가 될것이므로 외부에서 함부로 변경하면 안됨.
//    외부에 오픈되면 안되는 값이니 private으로 둔다. nationNum 변수를 private 으로 선언하고 setter 메소드 구현.
    private static int nationNum = 900000;
    public static int getNationNum() {
        //메서드가 static 이고 반환값 int이다.
        int i = 0; //지역변수
//        nationalName = "Soo"; //인스턴스 변수는 못씀. static 메서드 내부에서는 인스턴스 변수 사용 불가
        //getNationNum() 메소드 불려질 시점에 인스턴스 nationalName 없을 수 도있음. 인스턴스가 생성되지 않은 상태에서 가져다가 못씀.
        //메소드 호출되었을때 수행되려면 메소드 안에있는 요소들은 다 메모리를 가지고 있어야 된다.
        return nationNum;  //static 변수
    }

    private int nationalID;
    private String nationalName;
    private String province;
    private int birthday;
    private boolean isWoman;

    //국민이 태어날때마다 새로운 주민등록번호 부여하기
    public Nation() {
        nationNum++; //모든 인스턴스가 공유하는 값. 이 값으로 공유하면 주민번호가 모두 같아짐.
        nationalID += nationNum; //멤버변수에다가 저장해주면 됨. nationNum이 기준값이 되고 인스턴스는 생성될때마다 주민번호 하나씩 가지게됨.
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public String getNationalName() {
        return nationalName;
    }

    public void setNationalName(String nationalName) {
        this.nationalName = nationalName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String toString() {
        return "이름: " + getNationalName() + " 주민번호: " + getNationalID();
    }


}
