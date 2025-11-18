import java.util.Random;
import java.util.Scanner;

public class VB1Q6 {
    public static void main(String[] args) {
        
        // Initialize the constants
        final int TOTAL_CHESTS = 10;
        final int TOTAL_EGGS = 3;
        final int TOTAL_CURSED = 2;
        final int MAX_ATTEMPTS = 10;

        int[] chests = new int[TOTAL_CHESTS];

        Random rand = new Random();

        // Placing the eggs
        int eggsPlaced = 0;
        while (eggsPlaced < TOTAL_EGGS) {
            int chestIndex = rand.nextInt(TOTAL_CHESTS);
            if (chests[chestIndex] == 0) {
                chests[chestIndex] = 1;
                eggsPlaced++;
            }
        }

        // Placing the cursed chests
        int cursedPlaced = 0;
        while (cursedPlaced < TOTAL_CURSED) {
            int chestsIndex = rand.nextInt(TOTAL_CHESTS);
            if (chests[chestsIndex] == 0) {
                chestsIndex = 2;
                cursedPlaced++;
            }
        }

        // Initializng the game variable
        int attemptsLeft = MAX_ATTEMPTS;
        int eggsFound = 0;
        Scanner input = new Scanner(System.in);

        // Displaying game start
        System.out.println("Welcome to the Dragon Egg Quests!");
        System.out.println("There are " + TOTAL_CHESTS + " chests, " + TOTAL_EGGS + " dragon eggs, and " + TOTAL_CURSED + " cursed chests.");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to find all dragon eggs. \n");

        // Main game loop
        while ((attemptsLeft > 0) && (eggsFound < TOTAL_EGGS)) {
            System.out.printf("Attempts left: %d\n", attemptsLeft);

            // Input and validation loop
            int guess = -1;
            int guessIndex = -1;
            boolean validInput = false;

            // Input and validation loop
            while(!validInput) {
                System.out.printf("Guess a chest (1 - %d): ", TOTAL_CHESTS);

                // Check if input is an integer
                if (input.hasNextLine()) {
                    guess = input.nextInt();
                    input.nextLine(); 
                    guessIndex = guess - 1;

                    // Validate input range and if chest already opened
                    if ((guess >= 1) && (guess <= TOTAL_CHESTS)) {

                        // Check if already opened (3 is Opened/Found)
                        if (chests[guessIndex] != 3) {
                            validInput = true;
                        } else {
                            System.out.println("Chest " + guess + " has already been opened. Guess another chest.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and " + TOTAL_CHESTS + ".");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + TOTAL_CHESTS + ".");
                    input.next(); // Consume invalid token
                    input.nextLine(); // Consume newline
                }
            }

            // Process the guess
            int content = chests[guessIndex];
            int attemptsCost = 0;

            // If dragon egg found
            if (content == 1) {
                System.out.println("You found a dragon egg!");
                eggsFound++;
                chests[guessIndex] = 3; 
                attemptsCost = 1; 

            } else {
                // If cursed chest or empty chest
                if (content == 2) {
                    System.out.println("Oh no! You opened a cursed chest! You lose 2 extra attempts.");
                    attemptsCost = 2; 
                    chests[guessIndex] = 3;
                } else if (content == 0) {
                    attemptsCost = 1;
                    chests[guessIndex] = 3; 
                }

                // Proximity and hint logic
                int nearestEggIndex = -1;
                int minDistance = TOTAL_CHESTS + 1;

                // Loop through all chests to find the nearest remaining egg
                for (int i = 0; i < TOTAL_CHESTS; i++) {
                    if (chests[i] == 1) {
                        int distance = Math.abs(i - guessIndex);
                        if (distance < minDistance) {
                            minDistance = distance;
                            nearestEggIndex = i;
                        }
                    }
                }

                // Proximity check and hint based on the current remaining egg
                if (nearestEggIndex != -1) {

                    // Check nearby
                    if (minDistance <= 3) {
                        System.out.println("Warm! You're very close to a dragon egg!");
                    } else {
                        System.out.println("Cold! You're far from any dragon eggs.");
                    }

                    // Hint on chest number
                    if (guessIndex < nearestEggIndex) {
                        System.out.println("Hint: Try a higher numbered chest.");
                    } else if (guessIndex > nearestEggIndex) {
                        System.out.println("Hint: Try a lower numbered chest.");
                    }
                }
                System.out.println("No egg here, keep searching!");
            }

            // Update attempts left
            attemptsLeft -= attemptsCost;

            // Check for immediate win/loss
            if (eggsFound == TOTAL_EGGS) {
                System.out.println();
                System.out.println("Congratulations! You've found all the dragon eggs!");
                break; 
            }

            // Print separator unless exiting
            if (attemptsLeft > 0) {
                System.out.println();
            }
        }

        // Game over messages
        if ((eggsFound < TOTAL_EGGS) && (attemptsLeft <= 0)) {
            System.out.println();
            System.out.println("Game Over! You've run out of attempts.");   
        }

        input.close();
    }
}
