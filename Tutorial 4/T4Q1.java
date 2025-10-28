import java.util.Random;
import java.util.Scanner;

public class T4Q1 {
    public static void main (String[] args) {

        // Write statements for each of the following

        // a. Find the largest integer n so that n^3 is less than 2000.

        int largest_number = 0;
        for (int n = 0; (n * n * n) < 2000; n++) {
            largest_number = n;
        }
        System.out.printf("The largest of n so that n^3 is less than 2000 is: %d\n", largest_number);

        // b. Display the square number of the first twelve integers starting from 1.

        System.out.print("The first twelve square number: [");
        for (int i = 1; i <= 12; i++) {
            System.out.print(i * i);
            if (i < 12) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        // c. Display a 4-by-5 matrix using random number within 0 to 100.

        System.out.println("The 4 by 5 matrix with random number 0 - 100: ");
        Random rand = new Random();
        int random_number;
        for (int i = 1; i <= 5; i++) {
            System.out.print("[");
            for (int j = 1; j <= 4; j++) {
                random_number = rand.nextInt(101);
                System.out.print(random_number);
                if (j < 4) {
                    System.out.print(", ");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }

        // d. Compute the sum of numbers from 1 to a given number.

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number_input = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number_input; i++) {
            sum = sum + i;
        }
        System.out.printf("The sum of the numbers is %d\n", sum);
        input.close();

        // e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.

            double sum_of_the_series = 0;
            int denomenator = 25;
            for (int i = 1; i <= 25; i++) {
                sum_of_the_series += (double) i/denomenator;
                denomenator--;
            }
            System.out.printf("The sum of the series is %.2f\n", sum_of_the_series);
    }
}