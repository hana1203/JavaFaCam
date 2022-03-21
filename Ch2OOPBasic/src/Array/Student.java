package Array;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    public int ID;
    public String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    ArrayList<Subject> subjects = new ArrayList<Subject>();

    public void addSubject(String title, int score){
        subjects.add(new Subject(title, score));

    }

    public void showStudentInfo() {
        int total =0;
        for (int i=0; i < subjects.size(); i++) {
            System.out.println(name + " 학생의 " + subjects.get(i).getTitle() + " 과목 성적은 " +
                    subjects.get(i).getScore() + "점 입니다.");
            total += subjects.get(i).getScore();
        }
        System.out.println(name + " 학생의" + "총점은 " + total + " 점 입니다.");


    }
}
