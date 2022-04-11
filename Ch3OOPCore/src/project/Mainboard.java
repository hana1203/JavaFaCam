package project;

public class Mainboard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvancedLevel aPlayer = new AdvancedLevel();
        player.upgradeLevel(aPlayer); //Player 형으로 생성된 인스턴스에 Level 별로 클래스 형 인자를 넣는 upgradeLevel 메서드.
        // AdvancedLevel 인스턴스 넣어서 업그레이드 시키기
        player.play(2);

        SuperLevel sPlayer = new SuperLevel();
        player.upgradeLevel(sPlayer);
        player.play(3);

        System.out.println(player.getLevel()); //project.SuperLevel@4517d9a3

        player.upgradeLevel(aPlayer); //현재 super 형인 player 를 advancedLevel 로도 바꿀 수 있다.
        player.play(1); //advanced level 을 1개 넣어서 가능.

    }
}
