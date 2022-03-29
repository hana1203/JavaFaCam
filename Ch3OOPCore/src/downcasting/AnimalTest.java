package downcasting;

import java.util.ArrayList;
//Ch3-8 다운캐스팅과 instanceof

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

        //세 동물을 arrayList 배열에 넣고싶으면?
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(bAnimal);
        for (Animal animal:animalList) {
            animal.move(); //디형성
        }

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList); //다운캐스팅 원래타입으로 돌아가는것
    }

//    arrayList 를 매개변수로 주고 다운캐스팅하는 메서드 구현
//    다형성으로 오버라이딩해서 구현하는게 깔끔하다. 다운캐스팅쓰면 각 타입으로 되돌려야되고 코드가 지저분해짐.
//    반드시 원래 타입으로 돌아가야된다고 하면 instanceof 로 체크한 다음에 다운캐스팅 한다.
    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            } else {
                System.out.println("not supported type");
            }
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

