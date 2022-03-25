package objectcollaboration;

//Ch2-10. Access Modifier & Information Hiding  접근제어지시자 & 정보은닉
public class Birthday {
    private int day;
    private int month;
    private int year;
//    private boolean isValid; //boolean 기본값은 false 로 되어있음.
    private boolean isMonthValid;
    private boolean isDayValid;

//private 으로 막고 get set 제공하는 것과 그냥 public 으로 놓는것(다 오픈하던가)은 무슨 차이?
    // int day;
    // int month;
//실행하는 Driver 클래스 objectcollaboration.BirthdayTest 에서
    // bday.month = 100;
    // bday.day = 300;  이런식으로 넣을 수 있음
// 멤버변수의 오류가 객체가 잘못 사용되도록 노출되면서 객체의 역할에 문제가 생길수 있음.
// 이런 값들을 private 으로 막아주고 method 에서 setMethod 같은 것으로 제어해줄 수 있다.
// 객체의 멤버변수에 접근제한을 가하면서 객체를 사용할때 오류 막을 수 있다.

    public int getDay() {
        return day;
    }

//    public void setDay(int day) {
//        if (day < 0 || day > 31) {
//            isValid = false;
//        } else {
//            isValid = true;
//            this.day = day;
//        }
//    }
    public void setDay(int day) {
        if (day < 0 || day > 31) {
            isDayValid = false;
        } else {
            isDayValid = true;
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

//    public void setMonth(int month) {
//        if (month < 1 || month > 12) {
//            isValid = false;
//        }
//        else {
//            isValid = true;
//            this.month = month;
//        }
//    }
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isMonthValid = false;
        }
        else {
            isMonthValid = true;
            this.month = month;
        }
    }
    // setDay() 와 setMonth() 두개 메소드에서 똑같은 boolean 변수 isValid 쓰게되면 isValid 값이 마지막에 호출했던 함수의 boolean 값으로 저장되어 있는듯.
    //  bday.setMonth(숫자);
    //  bday.setDay(숫자); 드라이버 클래스에서 호출할 경우 //

    // setMonth true, setDay false 인 경우
    // Not valid date! showDate()의 false 값인 아이로 출력됨.
    // setMonth false, setDay true 경우
    // year: 2022 month: 0 day: 30   //month 값이 if에 걸리는 값인데도 0으로 출력한다.. 왜지?



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public void showDate() {
//        if (isValid)  //boolean변수 isValid 참일때
//        {
//            System.out.printf("year: %d month: %d day: %d", year, month, day);
//        } else {
//            System.out.println("Not valid date! ");
//        }
//    }

    public void showDate() {
        if (isMonthValid && isDayValid )
        {
            System.out.printf("year: %d month: %d day: %d", year, month, day);
        } else {
            System.out.println("Not valid date! ");
        }
    }

    public boolean getIsDayValid() {
        return isDayValid;
    }

}
