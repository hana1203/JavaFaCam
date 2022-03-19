public class BirthdayTest {
    public static void main(String[] args) {
        Birthday bday = new Birthday();
        bday.setYear(2022);
        bday.setMonth(11);
        bday.setDay(30);
        bday.showDate();
        bday.getIsDayValid();
    }
}
