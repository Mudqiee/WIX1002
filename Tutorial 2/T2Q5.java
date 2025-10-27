import java.util.Scanner;

public class T2Q5 {
    public static void main (String[] args) {
        
        /* Problem 1
        final double AMOUNT = "32.5";
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT); */
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);

        /* Problem 2
        string chapter = 'Summary';
        System.out.println(chapter);
         */
        String chapter = "Summary";
        System.out.println(chapter);

        /* Problem 3
        int num;
        ++num++;
        num1 = num;
         */
        int num = 0, num1;
        num++;
        num1 = num;
        System.out.println(num1);

        /* Problem 4
        String contact;
        Scanner keyboard = new Scanner(System.out);
        contact = keyboard.nextLine()
         */

        Scanner keyboard = new Scanner(System.in);
        String contact = keyboard.nextLine();
        System.out.println(contact);
        keyboard.close();

        /*Problem 5
        int num = 3000;
        System.out.printf("%4.2f\n", num);
         */

        int number = 3000;
        System.out.printf("%4d\n", number);        
        
    }
}
