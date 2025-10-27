import java.util.Scanner;

public class L3Q1 {
    public static void main (String[] args) {
        
        //Write a program that stimulates a simple calculator. It reads two integers and a
        // character. If the character is a +, the sum is printed; if it is a -, the difference is
        // printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if
        // it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)

        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int number_1 = input.nextInt();

        System.out.print("Second number: ");
        int number_2 = input.nextInt();

        System.out.print("Operators (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", number_1, number_2, number_1 + number_2);
                break;
            case '-':
                System.out.printf("%d - %d = %d\n", number_1, number_2, number_1 - number_2);
                break;
            case '*':
                System.out.printf("%d * %d = %d\n", number_1, number_2, number_1 * number_2);
                break;
            case '/':
                if (number_2 != 0) {
                    System.out.printf("%d / %d = %.2f\n", number_1, number_2, (double) number_1 / number_2);
                } else {
                    System.out.println("Error: Division by zero is not allowed.\n");
                }
                break;
            case '%':
                if (number_2 != 0) {
                    System.out.printf("%d %% %d = %d\n", number_1, number_2, number_1 % number_2);
                } else {
                    System.out.println("Error: Division by zero is not allowed.\n");
                }
                break;
            }
        input.close();
    }
}