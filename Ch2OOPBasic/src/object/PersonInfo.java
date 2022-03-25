package object;

public class PersonInfo {

    public String name;
    public int height;
    public int weight;
    public int age;

    public PersonInfo (String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void printPersonInfo(){
        System.out.printf("키가 %d이고 몸무게가 %d킬로인 사람이 있습니다. \n이름은 %s이고, 나이는 %d세입니다. ", height,weight, name,age);
    }
}

