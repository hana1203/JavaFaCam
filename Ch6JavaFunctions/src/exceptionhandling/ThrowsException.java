package exceptionhandling;
//예외처리 미루기

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    //일부러 exception 상황만드려고
    //throws 는 미루는것. 여기서 발생할 수 있지만 핸들링하지 않겠다. 메서드를 쓰는 쪽에서 핸들링한다.
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        //파일 오픈
        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className); //클래스를 동적으로 로드할수있음
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
//            test.loadClass("a.txt", "abc");
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e); //java.lang.ClassNotFoundException: abc
        }
        //이 블럭 안의 다른 모든 예외 default 로 핸들링하고 싶을때 최상위 익셉션 넣으면 됨.
        //Exception 이 모든 익셉션의 최상위. upcasting 됨. default 블록은 맨 마지막에 위치.
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("end");


    }
}
