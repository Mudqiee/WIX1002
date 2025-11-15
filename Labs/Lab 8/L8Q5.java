// Define  a  class  Game.  The  class  has  a  constructor  that  accept  player  name.  
// Besides, the  class  contains  a  method  move  that  move  the  dice. 
// Create  a  Tester  class  to  test  the program with two players and the player that reach 100 or more win the game.

import java.util.Random;

class Game {

    private String name;
    private int score;

    public Game(String name) {
        this.name = name;
    }

    public int move() {
        Random rand = new Random();
        int moveResult = rand.nextInt(6) + 1;
        this.score += moveResult; 
        return moveResult;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}

public class L8Q5 {
    public static void main(String[] args) {

        int game_rounds = 1, score_player_1 = 0, score_player_2 = 0, move_player_1, move_player_2;
        Game player1 = new Game("Vanderbilt");
        Game player2 = new Game("Jamilah");

        while ((player1.getScore() < 100) && (player2.getScore() < 100)) {
            System.out.printf("Round %d:\n", game_rounds);

            do {
                move_player_1 = player1.move();
                System.out.printf("%s moveed a %d\n", player1.getName(), move_player_1);
            } while (move_player_1 == 6);

            do {
                move_player_2 = player2.move();
                System.out.printf("%s moveed a %d\n",player2.getName(), move_player_2);
            } while (move_player_2 == 6);

            game_rounds++;
        }
        System.out.printf("%s : %d, %s : %d\n", player1.getName(), player1.getScore(), player2.getName(), player2.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.printf("%s Wins!\n", player1.getName());
        } else if (player1.getScore() < player2.getScore()) {
            System.out.printf("%s Wins!\n", player2.getName());
        } else {
            System.out.printf("Tie: %s and %s got same score\n", player1.getName(), player2.getName());
        }
    }
}
