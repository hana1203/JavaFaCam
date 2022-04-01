package abstractclass;
//Ch3-10. 추상클래스의 응용 -템플릿 메서드 패턴
/*
프레임워크는 흐름이 이미 정해져있다. 클래스를 넣으면 클래스가 어떻게 연동이되고 저클래스에 어떤 영향을 주는지.
정해진 흐름에서 place a hole 구멍을 메꾸는게 개발자가 할일. 구체적인 기능은 프로그래머가 하는 것
템플릿 메서드는 프레임워크에서 많이 쓰는 패턴
이미 시나리오가 다 정해져있다 어떻게어떻게 흘러갈것이다. 값을 넣으면 어떻게 보여질것이고 어떤 클래스에 어떤 영향을 미친다.
메시지를 만들고 클래스를 만드는게 프로그래머의 역할
템플릿 메서드 - 틀을 가진 메서드
시나리오 정의 해놓고 시나리오에 따라 흐름이 흘러가는데 그 안에 추상메서드가 있다.
그 추상메서드라는 메서드 패턴가진 클래스를 상속받은 클래스 쪽에서 구현한다.
흐름이 변하면 안되니까 final 로 메서드를 선언한다.
상속받은 하위클래스가 재정의 못하게끔. 중요한 흐름을 가지고있는 메서드라서.
클래스에 final 이 들어가면 상속할수 없는 클래스이다.
 */
public abstract class Car {
    public abstract void drive();
    public abstract void stop();
//    AICar 운전하는 차랑 다르기때문에 구현안한것
    //기능추가
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동켭니다");
    }
    public void turnOff() {
        System.out.println("시동끕니다");
    }

    public void washCar() {
        //추상메서드가 아니고 구현된 메서드이다. 그치만 구현내용만 없는것. 구현부는 있는데 statement 가 없는것.
        //필요한 경우에 재정의
        //CarAI 에선 재정의하고 CarManual 에선 정의 안한다.
        //Hook Method
    }
    // 이 시나리오는 변하면 안된다. 이 순서대로 해야된다. final 로 선언해준다.
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}

