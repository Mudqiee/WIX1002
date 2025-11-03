import java.util.Scanner;

public class T3Q5 {
    public static void main (String[] args) {
        //Write the java statements that determine whether the Leap year. A Leap year is
        // divisible by 4 but not by 100. However, a Leap year is also divisible by 400.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt(); 
        input.close();

        if (year % 400 == 0) {
            System.out.printf("Yes, %d is a leap year.\n", year);
        } else if (year % 100 == 0) {
            System.out.printf("No, %d is not a leap year.\n", year);
        } else if (year % 4 == 0) {
            System.out.printf("Yes, %d is a leap year.\n", year);
        } else {
            System.out.printf("No, %d is not a leap year.\n", year);
        }

        // The easier version
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.printf("Yes, %d is a leap year.\n", year);
        } else {
            System.out.printf("No, %d is not a leap year.\n", year);
        }
    }
}
