import java.util.Random;

public class L4Q5 {
    public static void main (String[] args) {

        // Write a simple two players dice game. Each player will take turns to roll a dice. The
        // first players that reach more than 100 points win the game. If the player rolls a 6, the
        // player will score 6 points and has the chance to roll again.

        Random rand = new Random();
        int game_rounds = 1, score_player_1 = 0, score_player_2 = 0, roll_player_1, roll_player_2;
        while ((score_player_1 < 100) && (score_player_2 < 100)) {
            System.out.printf("Round %d:\n", game_rounds);

            do {
                roll_player_1 = rand.nextInt(6) + 1;
                score_player_1 += roll_player_1;
                System.out.printf("Player 1 rolled a %d\n", roll_player_1);
            } while (roll_player_1 == 6);

            do {
                roll_player_2 = rand.nextInt(6) + 1;
                score_player_2 += roll_player_2;
                System.out.printf("Player 2 rolled a %d\n", roll_player_2);
            } while (roll_player_2 == 6);

            game_rounds++;
        }
        System.out.printf("Player 1: %d, Player 2: %d\n", score_player_1, score_player_2);
        if (score_player_1 > score_player_2) {
            System.out.println("Player 1 Wins!");
        } else {
            System.out.println("Player 2 Wins!");
        }
    }
}
