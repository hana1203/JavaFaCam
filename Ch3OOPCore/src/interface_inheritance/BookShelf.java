package interface_inheritance;

public class BookShelf extends Shelf implements Queue{
    //클래스 상속받는것 먼저 쓰고 인터페이스 타입 상속받는 것 뒤에 씀.
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        //arrayList 의 인덱스 값 반환해준다
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
