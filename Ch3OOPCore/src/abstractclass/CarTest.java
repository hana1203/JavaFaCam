package abstractclass;

public class CarTest {
    public static void main(String[] args) {
        CarManual carManual = new CarManual();
        CarAI carAi = new CarAI();
        carManual.run();
        System.out.println("==========");
        carAi.run();
    }
}
