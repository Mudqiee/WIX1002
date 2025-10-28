import java.util.Scanner;

public class L4Q1 {
    public static void main (String[] args) {

        // Write a program that accepts an integer from user. Then, display its entire factors in increasing order

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int int_input = input.nextInt();
        input.close();

        System.out.printf("The factor of %d is ", int_input);
        System.out.print("[");
        for (int i = 1; i <= int_input; i++) {
            if (int_input % i == 0) {
                System.out.print(i);
                if (i < int_input) {
                    System.out.print(", ");
            }
            }
        }
        System.out.print("]\n");
        
    }
}