import java.util.Random;

public class L3Q4 {
    public static void main (String[] args) {
        
        // Write a simple two players dice game. Each player will roll the dice twice and the
        // player with the highest score wins the game.

        Random rand = new Random();
        int player_1 = rand.nextInt(6) + 1;
        int player_2 = rand.nextInt(6) + 1;
        int score_1 = 0, score_2 = 0;

        System.out.printf("Round 1:\nPlayer 1 rolled %d, Player 2 rolled %d\n", player_1, player_2);

        score_1 += player_1;
        score_2 += player_2;
        player_1 = rand.nextInt(6) + 1;
        player_2 = rand.nextInt(6) + 1;

        System.out.printf("Round 2:\nPlayer 1 rolled %d, Player 2 rolled %d\n", player_1, player_2);
        
        score_1 += player_1;
        score_2 += player_2;

        if (score_1 > score_2) {
            System.out.printf("Player 1 is the winner,\nPlayer 1: %d\nPlayer 2: %d\n", score_1, score_2);
        } else {
            System.out.printf("Player 2 is the winner,\nPlayer 2: %d\nPlayer 1: %d\n", score_2, score_1);
        }
    }
}
