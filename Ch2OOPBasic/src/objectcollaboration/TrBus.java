package objectcollaboration;

public class TrBus {
    int busNum;
    int busPassenger;
    int busIncome;

    public TrBus(int busNum) {
        this.busNum = busNum;
    }

    public void take(int busIncome) {
        this.busIncome += 1100;
        busPassenger++;
    }

    public void showBusInfo() {
        System.out.printf("%d번 버스🚌의 승객은 %d명이고, 수입은 %d원 입니다.\n", busNum, busPassenger ,busIncome);
    }
}
