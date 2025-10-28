import java.util.Scanner;

public class L4Q4 {
    public static void main (String[] args) {
        
        // Write a program that ask user to enter the year and the first day of the year (0 for
        // Sunday, 1 for Monday, … , 6 for Saturday). Display the calendar for May and August.
        //"Wtfff, why?"

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println("[Sunday:0, Monday:1, Tuesday:2, Wednesday:3, Thursday:4, Friday:5, Saturday:6]");
        System.out.print("Enter the first day of the year (0 - 6): ");
        int first_day = input.nextInt();
        input.close();

        //To calculate the first day of the May 1st and August 1st 
        //depending on the year is a leap year or not
        //total day before may = 31 + (28 or 29) + 31 + 30 = 120 or 121
        //total = 121 + 31 + 30 + 31 = 212 or 213

        int may_1st, august_1st;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            may_1st = (first_day + 121) % 7;
            august_1st = (first_day + 213) % 7;
        } else {
            may_1st = (first_day + 120) % 7;
            august_1st = (first_day + 212) % 7;
        }
        //Display the May calendar
        System.out.println("           May            ");
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        for (int i = 0; i < may_1st; i++) {
            System.out.print("    ");
        }
        int may_days = 1;
        while (may_days <= 31) {
            if (may_days < 10) {
                System.out.printf(" %d  ", may_days);
            } else {
                System.out.printf("%d  ", may_days);
            }
            if ((may_1st + may_days) % 7 == 0) {
                System.out.print("\n");
            }
            may_days++;
        }
        System.out.print("\n");
        
        //Display the August calendar
        System.out.println("          August          ");
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        for (int i = 0; i < august_1st; i++) {
            System.out.print("    ");
        }
        int august_days = 1;
        while (august_days <= 31) {
            if (august_days < 10) {
                System.out.printf(" %d  ", august_days);
            } else { //Hello
                System.out.printf("%d  ", august_days);
            } 
            if ((august_1st + august_days) % 7 == 0) {
                System.out.print("\n");
            }
            august_days++;
        }
        System.out.print("\n");

    }
}
