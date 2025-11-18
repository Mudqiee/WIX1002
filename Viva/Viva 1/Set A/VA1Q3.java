import java.util.Scanner;

public class VA1Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T;

        // Getting the number of inquiries
        System.out.print("Enter the number of queries [1-50]: ");
        T = input.nextInt();

        // Looping until the amount of inquiries
        for (int i = 0; i < T; i++) {

            // Getting the height input
            System.out.print("Enter the height for the pattern's size [1-9]: ");
            int height = input.nextInt();

            // Check if the height input is valid or not
            if (height < 1 || height > 9) {
                System.out.println("Invalid height.");
                i--; 
                continue;
            }

            // Getting the pattern input
            System.out.print("Enter the pattern that you want [A (Angled) or P (Pyramid)]: ");
            char pattern = input.next().charAt(0);

            // If its A, the angled will be printed
            if (pattern == 'A' || pattern == 'a') {
                for (int j = 1; j <= height; j++) { // Looping until the height
                    for (int k = 1; k <= j; k++) { // Loopint until the number of the outer loop iteration
                        System.out.print(j); // Printing the current number of itaration of outer loop
                    }
                    System.out.println(); // Printing newlines for each iteration of outer loop
                }
            }

            // If its P, the piramid will be printing
            else if (pattern == 'P' || pattern == 'p') {
                for (int j = 1; j <= height; j++) { // Looping until the height
                    for (int k = 1; k <= j; k++) { // Looping until the number of outer loop iteration
                        System.out.print(k); // Printing the current itaration of inner loop,
                        // which printing the left side of the piramid in increasing order
                        // until the number of itaration of outer loop
                    }
                    for (int l = j - 1; l >= 1; l--) {
                        System.out.print(l); // Printing the current itaration of inner loop,
                        // which printing the right side of the piramid in decreasing order from j - 1
                        // until the iteration to the one
                    }
                    System.out.println(); // Printing the newline for each outer loop iteration
                }
            }
            else { // Check if the user input the invalid pattern
                System.out.println("Invalid pattern.");
                i--; 
            }
        }
        input.close();
    }
}
