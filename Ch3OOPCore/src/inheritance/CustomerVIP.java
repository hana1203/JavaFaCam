package inheritance;

//매출에 더 많은 기여를 하는 단골 고객 클래스로 만들기
//제품을 살때 10%를 할인해 줌
//보너스 포인트는 제품 가격의 5%를 적립해 줌
//담당 전문 상담원이 배정됨

public class CustomerVIP extends Customer {
    private int agentID;
    double discountRatio;

    public CustomerVIP() {
        customerGrade = "VIP";
        pointRatio = 0.05;
        discountRatio = 0.1;
    }

    public int getAgentID() {
        return getAgentID();
    }
}
