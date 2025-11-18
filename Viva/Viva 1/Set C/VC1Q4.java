import java.util.Scanner;

public class VC1Q4 {
    public static void main(String[] args) {

        // Getting the user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (1 - 20): ");
        int n = input.nextInt();
        // Check if the n is more than 20
        if (n > 20) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.print("Choose mode (1-Combinatorics, 2-Security, 3-Game): ");
        int mode = input.nextInt();

        // Calculating the factorial
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Determine the mode using switch statement
        switch (mode) {
            case 1:
                System.out.printf("In Combinatorics Mode: You can arrange %d ways using %d items\n", factorial, n);
                break;
            case 2:
                System.out.printf("In Security Mode: You can create %d unique password combinations using %d characters.\n", factorial, n);
                break;
            case 3:
                System.out.printf("In Game Mode: You can make %d unique level arrangements from %d elements.\n", factorial, n);
                break;
        }

    }
}
