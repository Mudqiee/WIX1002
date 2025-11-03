import java.util.Scanner;

public class T3Q1 {
    public static void main (String[] args) {

        //a. Determine whether 3x8=27.
        if ((3 * 8) == 27) {
            System.out.println("3 x 8 = 27 is true");
        } else {
            System.out.println("3 x 8 = 27 is false");
        }
        
        //b. Determine whether an input integer is an odd number or even number.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int input_number = input.nextInt(); 
        if ((input_number % 2) == 0) {
            System.out.printf("%d is an even number.\n", input_number);
        } else {
            System.out.printf("%d is an odd number.\n", input_number);
        }

        //c. Determine whether a character is a capital letter.
        System.out.print("Enter a Character: ");
        char input_character = input.next().charAt(0);
        
        if ((input_character >= 'A') && (input_character <= 'Z')) {
            System.out.printf("%c is a capital letter\n", input_character);
        } else {
            System.out.printf("%c is not a capital letter\n", input_character);
        }

        //d. Display two strings in alphabetical order ignoring their case.
        System.out.print("Enter the first string: ");
        String input_String_1 = input.next();
        System.out.print("Enter the second string: ");
        String input_String_2 = input.next();
        
        if (input_String_1.compareToIgnoreCase(input_String_2) > 0) {
            System.out.printf("[%s, %s]\n", input_String_2, input_String_1);
        } else {
            System.out.printf("[%s, %s]\n", input_String_1, input_String_2);
        }
        System.out.println(input_String_1.compareToIgnoreCase(input_String_2));

        //e. A switch statement that display Sunday, Monday, .., Satudary if the input is 0, 1, …, 6.
        System.out.print("Enter an integer between 0 to 6: ");
        switch (input.nextInt()) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:             
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range!");
        }

        input.close();
    }
}