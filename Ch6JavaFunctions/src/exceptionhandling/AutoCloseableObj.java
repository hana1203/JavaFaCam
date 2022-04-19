package exceptionhandling;

public class AutoCloseableObj implements AutoCloseable{

    @Override
    public void close() throws Exception {
        //로그 찍기
        System.out.println("closing...");
    }
}
