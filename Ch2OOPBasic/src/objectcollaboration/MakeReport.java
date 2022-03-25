package objectcollaboration;//Ch2-11. Encapsulation 캡슐화
//대부분의 멤버변수와 메소드를 감춤
//클라이언트가 제어할 수 있는 부분이 적음
//그 객체가 하는 기능이 매번 일관적으로 적용

//정리하자면, 객체지향 설계에서 중요한 부분
//이 메소드나 필드(멤버변수, 객체의 속성)를 외부에 공개할 것인가 말것인가
//객체를 어떻게 만들고 메소드와 속성을 정의하는가도 중요했지만
//메소드와 속성을 모두 공개하는게 아니고 어떻게 공개해서 사용자가 좀 더 편하게 + 객체도 오류 없이 잘 관리될 수 있냐가 중요
//프로그래밍 할때 어떤정보를 공개? 공개하지 않을지에 대한 고민도 필요

import org.w3c.dom.ls.LSOutput;

public class MakeReport {
    StringBuffer buffer = new StringBuffer();
    //String를 쭉 이어서 연결할때 많이씀. 더하기로 쓰는건 메모리 오버헤드가 매우 큼.
    //내부적으로 늘어날수있는 buffer를 가지고있는 클래스에다가 스트링을 연결해서 나중에 스트링값으로 리턴하는 값으로 많이 씀
    //StringBuffer, StringBuilder 방식으로 .append 메소드와 같이 사용

    private String line = "===========================================\n";
    private String title = "  name\t  address\t\t  phonenumber  \n";

    private void makeHeader()
    {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody()
    {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter()
    {
        buffer.append(line);
    }

    public String getReport()
    {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
    //private으로 닫혀놓은 메소드들은 클라이언트한테 오픈을 해봤자 클라이언트 입장에서는 순서를 알 필요도없고 소용없음.
    //클라이언트 프로그램에는 getReport() 만 제공해줌
}
