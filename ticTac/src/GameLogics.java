import java.util.Scanner;

public class GameLogics {
    public static void main(String[] args) {
        Game game2 = new Game();
        System.out.println();
        game2.Rules("привет,игрок, это игра- \"рестики нолики\",\nначинаем!");
        int i = 0;

        game2.game_gamePlay();

        String win = game2.game_win();
        System.out.println(win);
    }
}
