import java.util.Scanner;

public class VB1Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // GEtting the numebr of inquiries
        System.out.print("Enter the number of inquiries: ");
        int inquiries = input.nextInt();

        // Looping through each inquiry
        for (int i = 1; i <= inquiries; i++) {
            // Getting user inputs
            System.out.print("Enter the number of days overdue: ");
            int daysOverdue = input.nextInt();
            System.out.print("Enter the book type code \n(R for reference, G for general, M for magazine, C for CDs, T for Thesis): ");
            char bookType = input.next().toUpperCase().charAt(0);
            System.out.print("Enter the member type code \n(S for student, T for staff): ");
            char borrowerType = input.next().toUpperCase().charAt(0);
            System.out.print("Enter the number of previous late returns: ");
            int previousLateReturns = input.nextInt();

            // Initializing variables
            double baseFine = 0.0;
            double totalFine = 0.0;
            boolean isStaffDiscountApplied = false;
            boolean isGoodBorrowerDiscountApplied = false;

            // Calculating base fine based on book type and days overdue
            switch (bookType) {
                case 'R':
                    baseFine = 100.00;
                    break;
                case 'G':
                    // Calculating fine for General books
                    if (daysOverdue <= 5) {
                        baseFine = daysOverdue * 0.50;
                    } else if (daysOverdue <= 30) {
                        baseFine = (7 * 0.50) + ((daysOverdue - 7) * 1.00);
                    } else {
                        baseFine = (7 * 0.50) + (23 * 1.00) + ((daysOverdue - 30) * 2.00);
                    }
                    break;
                case 'M':
                    baseFine = daysOverdue * 0.20;
                    break;
                case 'C':
                    if (daysOverdue <= 10) {
                        baseFine = daysOverdue * 2.00;
                    } else {
                        baseFine = (10 * 2.00) + ((daysOverdue - 10) * 5.00);
                    }
                    break;
                case 'T':
                    baseFine = daysOverdue * 10.00;
                    break;
                default:
                    baseFine = 0.0; 
                    break;
            }

            // Calculating total fine with additional charges and discounts
            totalFine = baseFine;

            if (bookType == 'T' && daysOverdue > 15) {
                totalFine += 200.00;
            }

            if (daysOverdue > 60) {
                totalFine += 25.00;
            }
            if (previousLateReturns >= 3) {
                totalFine += 10.00;
            }
            if (borrowerType == 'T') {
                totalFine *= (1 - 0.20);
                isStaffDiscountApplied = true;
            }
            if (!isStaffDiscountApplied && previousLateReturns == 0 && daysOverdue <= 3) {
                totalFine *= (1 - 0.50);
                isGoodBorrowerDiscountApplied = true;
            }

            // Displaying the total fine
            System.out.println("--- Case " + i + " ---");
            System.out.printf("Total Fine: RM %.2f%n", totalFine);
        }
    }    
}
