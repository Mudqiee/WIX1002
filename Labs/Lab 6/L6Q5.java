import java.util.Scanner;
import java.util.Random;

public class L6Q5 {

    // Write a Java method that accepts three parameters, the method will compare whether 
    // the third parameter value is equal to the multiplication of parameter 1 and parameter 
    // 2. Then, write a Java multiplication game for any random number within 0 – 12.

    public static boolean multiplication(int a, int b, int c) {
        return (a * b == c)? (true) : (false);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int answer;
        int score = 0;
        do {
            int a = rand.nextInt(12) + 1;
            int b = rand.nextInt(12) + 1;
            System.out.printf("Enter negative number to quit.\n%d x %d = ", a, b);
            answer = input.nextInt();
            if (multiplication(a, b, answer)) {
                score++;
            }
        } while (answer > 0);
        input.close();
        System.out.printf("Your score: %d\n", score);
    }
}
