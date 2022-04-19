package exceptionhandling;

//09. 예외 처리하기와 미루기
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        //FileInputStream 이 하는일: file 에서 자료를 읽어들이는 역할하는 Stream. 자료처리하는 스트림이랑 다르고 입출력위한 스트림.
//        FileInputStream fis = null; //3 위해서 주석처리
//1.
//        try {
//            fis = new FileInputStream("a.txt"); //a.txt 파일 가장 상위 프로젝트 폴더인 JavaFaCam 안에 만들어야 작동되네..
//            //컴파일러에 의해 프로그램시에 익셉션 핸들링해야되는 익셉션 툴.
//            // 2가지 방법. Add throws, Surround with try/catch
//            // Add throws 하면 exception 을 내가 처리안하고 던진다는것. 여기서 던지면 main 이기때문에 VM 으로 넘어감. abort 비정상 종료된다.
//            //file 을 여러패스에서 찾는데 지금상태에선 가장 먼저 project 폴더 밑에서 파일 찾는다
//            try {
//                fis.close(); //닫을때도 try catch 헤줘야함.
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace(); //어디서 에러가 난건지 trace 해주는 것.
//            try {
//                fis.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//            //catch 안에서도 close() 넣어줘야되는데
//        }
//        System.out.println("end");

//2.
//        //여러단계에서 close() 시켜야 되는걸 try catch finally 로 가능하다
//        //finally 가 하는일: 오픈된 리소스(사용중인 리소스) 해제.
//        //try 구문 호출되면 finally 는 항상 무조건 호출된다. return 이 있어도 호출됨.
//        try {
//            fis = new FileInputStream("a.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//            return; //return 해도 finally 는 불린다.
//            //흠 왜 난 return 넣은거랑 뺀거랑 결과값이 똑같지
//        } finally {
//            if(fis!=null) // 열렸을때 close() 를 해야됨.
//            {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }System.out.println("finally 항상 수행");
//        }System.out.println("end 도 수행");

//3.
        //Try with resources 문
        //자바 9부터 처음에 리소스를 try() 안에 선언

        try(FileInputStream fis = new FileInputStream("a.txt")) {

        } catch (FileNotFoundException e) { //file 없을때 나는 익셉션
            e.printStackTrace();
        } catch (IOException e) { //close 할때 나는 익셉션
            e.printStackTrace();
        }
        System.out.println("end");
        //finally 쓸 필요없이 익셉션 처리됨.
        //자동으로 close 가 되는데 그 이유는 AutoClosable 이라는 인터페이스를 구현한다.
        //AutoClosable 라는 인터페이스를 구현하면 이 객체가 exception 났건 정상종료되었건
        //수행이 끝나면 close 가 자동으로 호출되도록 구현됨.
        //JDK 에 리소스 핸들링하는 많은 오브젝트들이 오토클로저블 함

    }
}
