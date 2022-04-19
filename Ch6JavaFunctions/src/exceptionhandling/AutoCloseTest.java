package exceptionhandling;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseableObj obj = new AutoCloseableObj();
        try(obj) {
            //obj 블락안에서 아무것도 안함. obj 쓰겠다고 하고 obj 에서 아무것도 안함
            //실행결과
//            closing...
//            end
            //exception 상황이면 ? 강제로 발생시키려면?
            throw new Exception();
            //closing...
            //exception
            //end
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
