public class TrSubway {
    String subwayLine;
    int subwayPassenger;
    int subwayIncome;

    public TrSubway(String subwayLine){
        this.subwayLine = subwayLine;
    }

    public void take(int subwayIncome){
        this.subwayIncome += 1300;
        subwayPassenger++;
    }

    public void showSubwayInfo() {
        System.out.printf("%s라인 지하철🚇의 승객은 %d명이고, 수입은 %d원 입니다.\n", subwayLine, subwayPassenger ,subwayIncome);
    }
}
