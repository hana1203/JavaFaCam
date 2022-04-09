package project;
//Ch3-16. 복습
//추상클래스와 템플릿 메서드

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    //template method
    //run(), count 만큼 jump(), turn()

    final public void go(int count) {
        run();
        for (int i=0; i<count; i++) {
            jump();
        }
        turn();
    }
}
