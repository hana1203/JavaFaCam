package exceptionhandling;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try{
            for (int i =0; i<=5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); //Index 5 out of bounds for length 5
            System.out.println(e.toString()); //exceiption 의 풀네임, 메시지
            // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }
        //매개변수처럼 이 케이스 exception 발생하면 e 라는 변수로 넘어오는것.

        //오류는 났지만 비정상적인 종료는 되지않는다.
        //서비스 돌릴때 스레드를 무한루프로 계속도는데 exception 이 발생하면 죽어버리진 않고 계속 돌리기는 한다.
    }
}
