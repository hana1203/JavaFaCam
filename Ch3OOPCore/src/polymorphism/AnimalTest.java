package polymorphism;

import java.util.ArrayList;
//Ch3-5 다형성과 다형성 사용하는 이유
/*
다형성이라는건 다른 클래스들이 한꺼번에 동일 클래스처럼 움직이지만 실제적인 구현은 다르게 나타날수있따.
 */
class Animal { //public class 아닌 class 로해야지 아래 public class AnimalTest 작동.
    public void move() {
        System.out.println("Animal moves");
    }

    public void eating() {
    }
    //공통적으로 쓸수있는 메서드있으면 상위클래스에서 선언하면 된다.
    //상위클래스에서 선언된 공톰메서드는 하위클래스에서 모두 사용할수 있다. 코드 재사용
}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("Human moves");
    }

    public void readBooks() {
        System.out.println("Human reads a book");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("Tiger jumps");
    }

    public void hunting() {
        System.out.println("Tiger hunts");
    }
}

class Bird extends Animal{
    public void move()  {
        System.out.println("Bird flies");
    }
    public void fly() {
        System.out.println("Bird flies high to the sky");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal bAnimal = new Bird();
        Animal tAnimal = new Tiger();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(bAnimal);

        //세 동물을 arrayList 배열에 넣고싶으면?
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(bAnimal);
        for (Animal animal:animalList) {
            animal.move();
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
//        코드는 한줄인데 어떤 인스턴스가 들어갔냐에따라 move() implementaion 구현이 달라진다.
//        Human moves
//        Tiger jumps
//        Bird flies
        /*
        인터페이스로도 다형성을 구현
        상속하게되면 하위클래스를 상위클래스 하나의 타입으로 모두 핸들링 가능하다.
        클래스간의 결합도가 타이트해진다. 상속 설계할때 신중하게 설계.
        여러 클래스타입을 Animal 로 핸들링하면서 move() 할때 각 인스턴스의 메서드가 호출된다.가상메서드 방식에 의해서.
         */
        //human 이 갖고있는 readBook 메서드는 호출못한다. - 다운캐스팅해야됨.

    }
}

