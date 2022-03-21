package Array;

//책을 가지고있는 배열만들기
public class BookTest {
    public static void main(String[] args) {
//        Array.Book library = new Array.Book(); //원래 클래스 불러올때 이렇게 인스턴스 생성해야됨.
//        그치만 객체 배열의 경우 이렇게 생성한다.

        Book[] library = new Book[5];

        //library 찍어보기
//        for (int i=0; i<library.length; i++) {
//            System.out.println(library[i]);
//        }
        //null 5번 찍힘
        //객체 배열의 경우 선언시 객체 주소들어갈 메모리가 null로 할당된다.
        //각 element의 객체는 따로 생성.

        library[0] = new Book("Harry Potter 1", "JK Rowling");
        library[1] = new Book("Harry Potter 2", "JK Rowling");
        library[2] = new Book("Harry Potter 3", "JK Rowling");
        library[3] = new Book("Harry Potter 4", "JK Rowling");
        library[4] = new Book("Harry Potter 5", "JK Rowling");

        for (Book book:library) {
            System.out.println(book); //Array.Book 자체 address 출력
            book.showBookInfo(); //객체 만들어짐.
        }
//        Array.Book@36baf30c
//        Harry Potter 1,JK Rowling
//        Array.Book@279f2327
//        Harry Potter 2,JK Rowling
//        Array.Book@2ff4acd0
//        Harry Potter 3,JK Rowling
//        Array.Book@54bedef2
//        Harry Potter 4,JK Rowling
//        Array.Book@5caf905d
//        Harry Potter 5,JK Rowling

//        객체 배열 사용시 주의사항
//        객체는 그냥 new한다고 만들어지는게 아니고 객체 만들어서 넣어야된다.



    }
}
