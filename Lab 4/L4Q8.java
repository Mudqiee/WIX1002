import java.util.Random;

public class L4Q8 {
    public static void main (String[] args) {

        // Write a program that generates the first n prime number. n is an random integer within 0 to 100.

        Random rand = new Random();
        int counter = 0,  random_number = rand.nextInt(101);
        int factor_counter = 0;

        System.out.printf("The first %d prime number is [", random_number);
        for (int i = 2; counter < random_number; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        factor_counter++;
                    }
                }
                if (factor_counter == 2) {
                    System.out.print(i);
                    counter++;
                if (counter < random_number) {
                    System.out.print(", ");
                }
                } 
                factor_counter = 0;
            }
        System.out.print("]\n");
        
    }
}