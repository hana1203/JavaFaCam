//Ch2-19.
public class CarFactory {
    CarFactory() {
    }

    private static CarFactory factory = new CarFactory();

    public static CarFactory getInstance() {
        return factory;
    }

    public Car createCar() {
        //객체 생성해주는 메소드. 메소드 안에서 new Car 하나가 되서 참조변수가 반환됨.
        // 반환 타입 Car 가 되고 생성시 CarNum 라는 하나씩 준다.
        Car car = new Car();
        return car;
    }
}