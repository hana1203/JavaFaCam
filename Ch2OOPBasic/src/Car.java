public class Car {
    private static int carNum = 10000;
    private int carSerialNum;

    Car() {
        carNum++;
        carSerialNum += carNum;
//        carSerialNum = carNum; //+빼도 똑같이 작동
    }

    public int getCarNum() {
//        return carSerialNum += CarFactory.carNum; //오류남
        return carSerialNum;
    }

    //private 변수는 다른 클래스에서 쓰지 못하므로 그 클래스 안에서만 쓰인다.
    //private carNum, carSerialNum 모두 Car 클래스 안에서 선언되어야 했던것.

}
