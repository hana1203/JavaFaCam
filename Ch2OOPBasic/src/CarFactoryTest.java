public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car bmw = factory.createCar();
        Car mini = factory.createCar();
        System.out.println(bmw.getCarNum());
        System.out.println(mini.getCarNum());

    }
}
