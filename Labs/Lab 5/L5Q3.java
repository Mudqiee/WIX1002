import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
     
        // Write a program that randomly generate the seven day work hours (1-8 hours) for N employee.
        // Then, display the work hours in seven days and the total hours for each employee.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employee: ");
        int number_of_employee = input.nextInt();
        input.close();

        Random rand = new Random();
        int working_days = 7;

        int[][] employee = new int[number_of_employee][working_days];

        String header = "Employee   Sun   Mon   Tue   Wed   Thu   Fri   Sat   Total hours";
        System.out.println(header);
        
        for (int i = 0; i < number_of_employee; i++) {
            int total_hours = 0;
            System.out.printf("%-11d", i + 1);
            for (int j = 0; j < working_days; j++) {
                employee[i][j] = rand.nextInt(8) + 1;
                System.out.printf("%-6d", employee[i][j]);
                total_hours += employee[i][j];
            }
            System.out.printf("%d\n", total_hours);
        }
    }    
}
