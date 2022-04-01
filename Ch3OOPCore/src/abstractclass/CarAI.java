package abstractclass;

public class CarAI extends Car {
    @Override
    public void drive() {
        System.out.println("자울주행 합니다");
        System.out.println("스스로 방향을 바꿉니다");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 멈추었습니다.");
    }

    @Override
    public void wiper() {
    }

    public void washCar() {
        System.out.println("자동세차를 합니다");
    }

}
