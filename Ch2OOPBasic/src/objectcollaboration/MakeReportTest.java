package objectcollaboration;

public class MakeReportTest {
    public static void main(String[] args) {
        MakeReport report = new MakeReport();
//        String builder= report.getReport();
//        System.out.println(builder);
        System.out.println(report.getReport()); //builder 안 만들고 바로 출력해도 작동하네
    }
}
