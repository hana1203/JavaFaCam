package exceptionhandling;
//10. 사용자정의 예외클래스와 활용.
/*
시스템 개발하다보면 필요한 경우에는 익셉션 핸들링하고 로그를 남겨서 안정적 시스템을 구현한다.
모든 Exception 이 입맛에 맞지는 않음.
 */

public class PasswordException extends Exception{
    public PasswordException(String message) {
        super(message);

    }

}
