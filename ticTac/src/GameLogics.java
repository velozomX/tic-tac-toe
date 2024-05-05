import java.util.Scanner;

public class GameLogics {
    public static void main(String[] args) {
        Game game2 = new Game();
        System.out.println();
        System.out.println("привет,игрок, это игра- \"крестики нолики\",\nначинаем!");
        int i = 0;

        game2.game_gamePlay();

        String win = game2.game_win();
        System.out.println(win);
    }
}
