import java.util.Scanner;
import java.util.Arrays;

public class VB2Q4 {

    public static void main(String[] main) {

        // Reading the three board from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row 1: ");
        String row1 = input.next();
        System.out.print("Enter row 2: ");
        String row2 = input.next();
        System.out.print("Enter row 3: ");
        String row3 = input.next();

        // Creating the 2D array to represent the board
        char[][] board = {
            {row1.charAt(0), row1.charAt(1), row1.charAt(2)}, 
            {row2.charAt(0), row2.charAt(1), row2.charAt(2)},
            {row3.charAt(0), row3.charAt(1), row3.charAt(2)}
        };

        // Calling the checkWinner() to get the result
        if (isBoardValid(board)) { // Checking if the board valid or not
            System.out.println("Winner: " + checkWinner(board)); 
        } else {
            System.out.println("Invalid board: number of moves is invalid");    
        }
    }

    static char checkWinner(char[][] board) {

        // Declare the predetermined winning position
        int[][] winningPosition = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
        };
        int[] XPosition = new int[countMoves(board, 'X')]; // Creating an array of X position
        int[] OPosition = new int[countMoves(board, 'O')]; // Creating an array of O position
        int XIndex = 0, OIndex = 0; // Declaring the index position of X and O
        int position = 0; // The current position in each itiration
        // Putting the current position index to the respective X or O array based on their position
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    XPosition[XIndex] = position;
                    XIndex++; // Move the index to the next
                }
                if (board[i][j] == 'O') {
                    OPosition[OIndex] = position;
                    OIndex++; // Move the index to the next
                }
                position++; // Move the index to the next
            }
        }

        // Sort the array
        Arrays.sort(XPosition);
        Arrays.sort(OPosition);

        for (int[] combo : winningPosition) { // For each combo in winningPosition
            if (checkCombo(XPosition, combo)) {
                return 'X';
            }
            if (checkCombo(OPosition, combo)) {
                return 'O';
            }
        }
        // If no winner found, return nothing
        return ' ';
    }

    static boolean checkCombo(int[] playerMoves, int[] combo) {

        // binarySearch(), if found, it will return the index of the element found.
        // Then, the index of the element will be equal or more than 0 resulting the variable will be true.

        // boolean win1 = Arrays.binarySearch(playerMoves, combo[0]) >= 0;
        // boolean win2 = Arrays.binarySearch(playerMoves, combo[1]) >= 0;
        // boolean win3 = Arrays.binarySearch(playerMoves, combo[2]) >= 0;

        for (int i = 0; i < 3; i++) {
            if (!(Arrays.binarySearch(playerMoves, combo[i]) >= 0)) {
                return false;
            }
        }

        // If all of the match, checkCombo willl be true
        return true;
    }

    // to countMoves of each character
    static int countMoves(char[][] board, char player) {
        
        int movesCount = 0; // Initialize the moveCount to 0
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == player) { // If its matched
                    movesCount++; // Moves count increase by 1
                }
            }
        }
        return movesCount; // return the final movecount
    }

    // To check if the board valid or not
    static boolean isBoardValid(char[][] board) {
        int XCount = countMoves(board, 'X'); // Getting the count of X
        int OCount = countMoves(board, 'O'); // Getting the count of X
        return (XCount == OCount || XCount == OCount + 1) ? (true) : (false);
        // return true if the XCount or XCount + 1 and OCount matched, which means its valid
    }
}
