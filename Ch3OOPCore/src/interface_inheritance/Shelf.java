package interface_inheritance;

import java.util.ArrayList;

//책장안에 책이 쭉있다. 맨 뒤에 책넣고 맨앞에 있는 책만 꺼낼수있는 구조
public class Shelf {
    //순서대로 물건 담아두기 위해 ArrayList 쓰기
    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>();
        //생성자 호출될 때 멤버변수 초기화 initialize 하는 게 좋다.
    }

    public ArrayList getShelf() {
        return shelf;
    }

    //Shelf 가지고 있는 물건 갯수 반환해주는 메서드
    public int getCount() {
        return shelf.size();
    }

}
