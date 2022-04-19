package exceptionhandling;

//08 예외처리는 왜하나? 자바에서 제공되는 클래스
/*
프로그램 상에서 exception 처리해줘야 됨.
익셉션 처리하지 않으면 컴파일 오류.
io 와 관련된 파일 입출력, 네트워크 커넥션, db 커넥션 있어서는 exception 처리해야됨.
1. 시스템이 죽지 않게 하려고. 비정상 종료되는 것 abort 막음.
2. 어디서 에러가 생길지 모름. 여러가지 버그상황 발생하는데 로그를 남기면 버그를 fix 할 수 있도록 찾아볼수있다.
시스템 설계할때 로그를 어떻게 남길것인가 에대한 회의와 프레임워크를 설계한다.

시스템 오류
자바에선 예외가 크게 두가지 - Exception, Error
Exception, Error 클래스 모두 Throwable 로부터 상속받는다.
Exception 이 모든 예외에 대한 최상위 클래스이다.
시스템적인 에러 프로그램적으로 처리할수 없는 에러 - 스택오버플로우, 동적메모리 할당 할 수없을때

Exception = IOException, RuntimeException
RuntimeException 실행오류 예외처리 - Arithmetic, IndexOutofBounds
컴파일러에 의해 발견되지 않고 런타임시 발견되는 애들이기때문에 내가 생각하지 않은 익셉션 발생할수있다.
cf. 대부분 오류는 컴파일러에 대해 detection 이 되고 우리가 프로그램에 try catch 처리안하면
 컴파일 되지 않아서 수행할 수가 없다.
IOException 입출력 예외처리

필요한 경우에 필요한 exception 을 잘 핸들링한다.
 */
public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try{
            for (int i =0; i<=5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) //매개변수처럼 이 케이스 exception 발생하면 e 라는 변수로 넘어오는것.
        {
            System.out.println(e.getMessage()); //Index 5 out of bounds for length 5
            System.out.println(e.toString()); //exception 의 풀네임: 메시지 로 구성.
            // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }
        System.out.println("end!!"); // 여기까지 잘찍힌다.

        //오류는 났지만 비정상적인 종료는 되지않는다.
        //서비스 돌릴때 스레드를 무한루프로 계속도는데 exception 이 발생하면 죽어버리진 않고 계속 돌리기는 한다.
    }
}
