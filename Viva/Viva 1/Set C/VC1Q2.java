import java.util.Scanner;

public class VC1Q2 {
    public static void main(String[] args) {

        // Initialize Scanner once outside the loop
        Scanner input = new Scanner(System.in);
        
        // Determine the customer types
        while (true) {
            
            System.out.print("Are you Residential(r) or Commercial(c) or Exit(0): ");
            // Check if next input is a char
            if (!input.hasNext()) {
                System.out.println("Invalid input format.");
                input.next(); // Consume the invalid token if any
                continue;
            }
            char customerType = input.next().charAt(0);

            // Exit condition
            if (customerType == '0') { 
                System.out.println("Thank you, bye");
                break;
            }

            System.out.print("Enter the liters of water consumed: ");
            double waterConsumed = input.nextDouble();

            double ratePerLiter;
            double totalBill;

            if ((customerType == 'c') || (customerType == 'C')) {

                // Determine the rate per liter based on the water consumption
                System.out.println("Customer Type: commercial");
                if (waterConsumed <= 1000) {
                    ratePerLiter = 0.02;
                } else if (waterConsumed <= 5000) { 
                    ratePerLiter = 0.05;
                } else {
                    ratePerLiter = 0.08;
                }
                
                // Calculate and display the bill for commercial customers
                totalBill = waterConsumed * ratePerLiter;
                System.out.printf("Water Usage: %.2f L\n", waterConsumed);
                System.out.printf("Rate Per Liter: RM%.2f\n", ratePerLiter);
                System.out.printf("Total Bill: RM%.2f\n", totalBill);
                System.out.println("Thank you for conserving water!");
                
                // Break the loop after successful calculation and display
                break; 

            } else if ((customerType == 'r') || (customerType == 'R')) {
                System.out.println("Customer Type: residential");
                if (waterConsumed <= 10000) {
                    ratePerLiter = 0.06;
                } else {
                    ratePerLiter = 0.10;
                }
                
                // Calculate and display the bill for residential customers
                totalBill = waterConsumed * ratePerLiter;
                System.out.printf("Water Usage: %.2f L\n", waterConsumed);
                System.out.printf("Rate Per Liter: RM%.2f\n", ratePerLiter);
                System.out.printf("Total Bill: RM%.2f\n", totalBill);
                System.out.println("Thank you for conserving water!");

                // Break the loop after successful calculation and display
                break;

            } else {
                // Handle invalid customer type input
                System.out.println("Invalid Customer Types input. Please enter 'r', 'c', or '0' to exit.");
            }
        }
        
        // Close the scanner after the loop
        input.close();
    }
}