import java.util.Random;

public class L4Q6 {
    public static void main (String[] args) {

        // Write a program that generates a non-negative random integer.
        // Display the number of digits in the integer.

        Random rand = new Random();
        int random_number = rand.nextInt(2147483647);
        int counter = 0;
        System.out.printf("The number %d ", random_number);
        while (random_number > 0) {
            random_number /= 10;
            counter++;
        }
        System.out.printf("contains %d digits.\n", counter);
    }
}
