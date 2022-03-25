package objectcollaboration;

import java.util.function.DoubleToIntFunction;

public class TrTaxi {
    String taxiCompany;
    int taxiIncome;

    public TrTaxi(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    public void take(int taxiIncome) {
        this.taxiIncome =+ 10000;
    }

    public void showTaxiInfo() {
        System.out.println(taxiCompany+"🚖 수입은 "+taxiIncome+"원 입니다.");
    }
}
