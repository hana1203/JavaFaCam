public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car bmw = factory.createCar();
        Car mini = factory.createCar();
        Car genesis = factory.createCar();
        System.out.println(bmw.getCarNum()); //10001
        System.out.println(mini.getCarNum()); //10002
        System.out.println(genesis.getCarNum()); //10003

    }
}
