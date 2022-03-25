package objectcollaboration;// Ch2-13. 객체간의 협력 Collaboration.
//객체지향 프로그램은 어떤것을 객체로 만들것이냐. 객체의 속성이 뭐고 그 객체가 해야될 일이 뭐냐.
//객체가 하는 일이 혼란스러우면 안됨. 객체가 하는 일은 그 객체 이름에 맞는 유일한 일을 하는게 맞음.
//하나의 객체가 혼자돌아가는게 아니라 유기적으로 연관될 수 있음.
//매개변수로 객체 자체가 전달되는 경우가 종종있다.

public class TransportUser {
    String name;
    int money;

    public TransportUser(String name, int money) { //여기서 파라미터 빈값으로 넣으면 어케되지?
        this.name = name;
        this.money = money;
    }

    public void takeBus(TrBus bus) { //어떤 버스를 탔는지를 매개변수로 넣음
        this.money -= 1100;
        bus.take(1100);
    }

    public void takeSubway(TrSubway subway) {
        this.money -= 1300;
        subway.take(1300);
    }

    //taxi 추가
    public void takeTaxi(TrTaxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfo() {
        System.out.println(name+"님의 잔액은 "+money+"원 입니다.");
    }
}
