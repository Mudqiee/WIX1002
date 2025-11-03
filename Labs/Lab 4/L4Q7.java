import java.util.Scanner;

public class L4Q7 {
    public static void main (String[] args) {

        // Write a program that used to calculate mortgage loan. The program will create the
        // amortization table with equal total payment plan. The following are the formula and
        // the sample output.
        
        // Formulas

        // M = (P * (i / (12 * 100))) / (1 - (1 + (i / (12 * 100)))-N)

        // M = Monthly payment
        // P = Principal
        // i = yearly interest rate in %
        // N = total number of months

        // Cₙ = M * (1 + (i / (12 * 100)))^(-(1+N-n))

        // Lₙ = M - Cₙ

        // Rₙ = Lₙ / (i / (12 * 100)) - Cₙ

        // C = Principal portion due
        // n = month under consideration
        // L = interest due
        // R = remaining principal balance due

        // Console Output

        // Enter principal amount: 10000
        // Enter interest in %: 4
        // Enter total number of month(s): 12

        // Month     Monthly Payment     Principal     Interest     Unpaid Balance     Total Interest
        // 1         851.50              818.17        33.33        9181.83            33.33
        // 2         851.50              820.89        30.61        8360.94            63.94
        // 3         851.50              823.63        27.87        7537.31            91.81
        // 4         851.50              826.37        25.12        6710.94            116.93
        // 5         851.50              829.13        22.37        5881.81            139.30
        // 6         851.50              831.89        19.61        5049.92            158.91
        // 7         851.50              834.67        16.83        4215.25            175.74
        // 8         851.50              837.45        14.05        3377.80            189.79
        // 9         851.50              840.24        11.26        2537.56            201.05
        // 10        851.50              843.04        8.46         1694.52            209.51
        // 11        851.50              845.85        5.65         848.67             215.16
        // 12        851.50              848.67        2.83         0.00               217.99

    Scanner input = new Scanner(System.in);
    System.out.print("Enter principal amount: ");
    double principal = input.nextDouble();
    System.out.print("Enter interest in %: ");
    double interest = input.nextDouble();
    System.out.print("Enter total number of month(s): ");
    double number_of_month = input.nextDouble();
    input.close();

    // double principal = 10000;
    // double interest = 4;
    // double number_of_month = 12;
    double total_interest = 0;
    double monthly_payment, principal_paid, interest_due, unpaid_balance;

    String header = "Month     Monthly Payment     Principal     Interest     Unpaid Balance     Total Interest";
    System.out.println(header);
    for (int month = 1; month <= number_of_month; month++) {
        monthly_payment = (principal * (interest / (12 * 100))) / (1 - Math.pow((1 + (interest / (12 * 100))), -number_of_month));
        principal_paid = monthly_payment * Math.pow((1 + (interest / (12 * 100))),(-(1 + number_of_month - month)));
        interest_due = monthly_payment - principal_paid;
        unpaid_balance =  interest_due / (interest / (12 * 100)) - principal_paid;
        total_interest += interest_due;
        System.out.printf("%-10d%-20.2f%-14.2f%-13.2f%-19.2f%-14.2f\n", month, monthly_payment, principal_paid, interest_due, unpaid_balance, total_interest);
    }
    
    }
}