package array;

//객체배열 복사하기
public class BookObjectCopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        //복사할 배열 만들기
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("Harry Potter 1", "JK Rowling");
        library[1] = new Book("Harry Potter 2", "JK Rowling");
        library[2] = new Book("Harry Potter 3", "JK Rowling");
        library[3] = new Book("Harry Potter 4", "JK Rowling");
        library[4] = new Book("Harry Potter 5", "JK Rowling");

//        깊은복사
//        default constructor 로 책을 쭉 만듬.
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }
//      주소 달라지고 libary 객체 정보바뀌어도 copylibrary 객체정보엔 영향주지 않는다.
///////

//        주소 복사해주는 arraycopy 메소드는 이제 필요없으니 주석처리
//        //객체 배열 복사하기
//        //library[0]..[4] 내용을 copyLibrary에 복사하려고
//        java package에서 기본제공되는 System.arraycopy 배열 복사 메서드
//        System.arraycopy(library, 0, copyLibrary, 0, 5);

        //책 정보 바꿔서 한번 추가해보기
        library[0].setAuthor("박완서");
        library[0].setTitle("닭");

        //기존 원래 배열
        System.out.println("==library==");
        for (Book book : library) {
            System.out.println(book);
            book.showBookInfo();
        }

        //copy된 배열
        System.out.println("==copy library==");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showBookInfo();
        }
        //주소 똑같이 카피됨. 두 배열이 같은 객체를 가리킨다.
        //내용도 똑같이 바뀐다.

        //얕은 복사 (샬로드 copy)
        //두개의 배열이 같은 객체를 가리켜야되는 상황에 쓴다.
        //배열 두개가 복사가 되었지만 같은 값 가리킨다.
        //객체값 바뀌게되면 원래배열과 카피된 배열 모두에 영향을 미친다.

        //따로 객체를 가지고싶으면? 깊은복사
        //객체를 일일이 다 만들고 복사 - 두 개는 전혀다른 객체를 가지게된다.
    }
}


