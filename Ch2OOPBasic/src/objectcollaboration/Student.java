package objectcollaboration;// Ch2-09. 참조자료형 변수
// 직접 클래스를 만들어서 그 아이를 멤버변수로 사용하고 싶을때
// 객체이기때문에 그냥 변수를 선언하고 바로 쓸 수 없다. 생성하고 써야된다.
// String은 예외 String은 primitive type 기본자료형 변수아니고 참조자료형이지만 생성자없이 가능.
// 객체를 변수로 사용하려면 생성해서 사용해야된다

public class Student {
    int studentID;
    String studentName;
    StudentSubject potions;
    StudentSubject charms;
    //objectcollaboration.StudentSubject 많아지면 배열로 쓸 수 있다.
    //멤버변수의 참조자료형을 우리가 만든 것 가져다가 할 수 있다.
    //그런데 그냥 쓰는게 아니고 생성해서 써야된다.
    //참조자료형으로 분리하는게 좀더 각각 객체에 대한 역할, 기능을 분명하게 할 수 있다.
    //자꾸 연습해서 사용할수 있게 하기.

    //생성자
    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        //GradeSubject math = new GradeSubject(); //이렇게 생성자에 한번에 넣으려고하니 안됨..
        //참조자료형을 멤버변수로 사용하는 경우 생성자에서 생성함. 꼭 생성자에서 안해도 되지만 사용하기 이전에 변수 선언해야됨.
        potions = new StudentSubject();
        charms = new StudentSubject();
    }

    public void setPotionsSubject(String name, int score, String address, String professor) {
        potions.subjectName = name;
        potions.score = score;
        potions.address = address;
        potions.professor = professor;
    }

    public void setCharmsSubject(String name, int score, String address, String professor) {
        charms.subjectName = name;
        charms.score = score;
        charms.address= address;
        charms.professor = professor;
    }

    public void showStudentScore() {
        int total = potions.score + charms.score;
        System.out.println(studentName + " got total of " +total+" grade.");
    }

    public String toString() {
        return "Name: " + studentName + "\nClass: " + potions.subjectName + "\nClassroom: " + potions.address + "\nProfessor: "+ potions.professor +
                "\nClass: " + charms.subjectName + "\nClassroom: " + charms.address + "\nProfessor: "+ charms.professor ;

    }
}

