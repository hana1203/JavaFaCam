package project.templateMethod;

public class BeginnerLevel extends PlayerLevel{
    public void run() {
        System.out.println("천천히 달립니다");
    }
    public void jump() {
        System.out.println("jump 못하지롱");
    }
    public void turn() {
        System.out.println("turn 못하지롱");
    }
    public void showLevelMessage() {
        System.out.println("***** 초급자 레벨입니다 *****");
    }
}
