//Ch2-23. 객체 배열을 구현한 클래스 ArrayList
//ArrayList 객체 배열을 좀더 효율적으로 관리하기 위해 자바에서 제공해 주는 클래스
package Array;

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();
        //Book 이 다른 패키지에 있었다면 빨간줄.이 클래스의 위치를 모른다. import 해주어야함.

        library.add(new Book("Charlie Chocolate","Roald Dahl"));
        library.add(new Book("Matilda","Roald Dahl"));
        library.add(new Book("Lemon1","Roald Dahl"));
        library.add(new Book("Lemon2","Roald Dahl"));
        library.add(new Book("Lemon3","Roald Dahl"));

        for (int i=0; i<library.size(); i++) {
            library.get(i).showBookInfo();
        }



   }
}
