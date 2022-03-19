import com.sun.jdi.connect.Transport;

public class TransportTest {
    public static void main(String[] args) {
        TransportUser tae = new TransportUser("Tae", 5000);
        TransportUser jim = new TransportUser("Jim", 10000);

        TrBus bus100 = new TrBus(100);
        TrSubway subwayGreen = new TrSubway("Green");

        tae.takeBus(bus100);
        tae.takeSubway(subwayGreen);
        tae.showInfo();

        jim.takeBus(bus100);
        jim.takeSubway(subwayGreen);
        jim.showInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();

        //taxi 추가
        TrTaxi seoultaxi = new TrTaxi("서울택시");
        TransportUser lion = new TransportUser("Lion", 20000);
        lion.takeTaxi(seoultaxi);
        lion.showInfo();
        seoultaxi.showTaxiInfo();
    }

}
