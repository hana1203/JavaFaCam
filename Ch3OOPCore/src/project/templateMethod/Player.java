package project.templateMethod;

public class Player {
    //Player 의 play() 가 불리면 go(int) 호출된다
    //upgradeLevel(PlayerLevel) 매개변수 추상클래스 - 비기너, 중급, 수퍼 될 수있다.
    PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
        }
}




