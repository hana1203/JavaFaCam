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
        System.out.printf("%dλ² λ²μ€πμ μΉκ°μ %dλͺμ΄κ³ , μμμ %dμ μλλ€.\n", busNum, busPassenger ,busIncome);
    }
}
