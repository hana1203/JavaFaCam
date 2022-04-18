package exceptionhandling;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseable obj = new AutoCloseableObj();
        try(obj) {
            //
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
