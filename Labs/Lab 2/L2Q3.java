import java.util.Random;

public class L2Q3 {
    public static void main (String[] args) {

    /*
    Write a program that generates three random numbers. The range of the random
    number is 10 to 50. Display the three numbers, sum of the numbers and the average in
    two decimal places.
     */

    Random rand = new Random();
    int number_1 = rand.nextInt(41) + 10;
    int number_2 = rand.nextInt(41) + 10;
    int number_3 = rand.nextInt(41) + 10;

    System.out.printf("Number 1: %d ", number_1);
    System.out.printf("Number 2: %d ", number_2);
    System.out.printf("Number 3: %d \n", number_3);

    System.out.printf("Sum: %d ", number_1 + number_2 + number_3);
    System.out.printf("Average: %.2f\n", ((number_1 + number_2 + number_3) / 3.0));
    

    }
}
