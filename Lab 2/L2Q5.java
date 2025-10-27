import java.util.Random;
public class L2Q5 {
    public static void main (String[] args) {

        /*
        Write a program that generates one random number. The range of the random
        number is 0 to 10000. Display the number and the sum of all the digits in the number.
        */

        Random rand = new Random();
        int random_number = rand.nextInt(10001);
        System.out.printf("Random number: %d\n", random_number);

        int sum_or_all_digit = 0;

        sum_or_all_digit += random_number / 10000;
        random_number %= 10000;
        sum_or_all_digit += random_number / 1000;
        random_number %= 1000;
        sum_or_all_digit += random_number / 100;
        random_number %= 100;
        sum_or_all_digit += random_number / 10;
        random_number %= 10;
        sum_or_all_digit += random_number;

        System.out.printf("Sum of all digits: %d\n", sum_or_all_digit);

        
    }
}
