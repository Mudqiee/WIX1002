import java.util.Scanner;

public class VB1Q2 {
    public static void main(String[] args) {

        // Initializing Scanner
        Scanner input = new Scanner(System.in);

        // Initializing variables
        double subtotal = 0;
        double currentItem;

        // Getting item prices
        while (true) {
            System.out.print("Enter item price (0 to finish): ");
            currentItem = input.nextDouble();
            if (currentItem < 0) {
                System.out.println("Invalid Input!");
                continue;
            } else if (currentItem == 0) {
                break;
            } else {
                subtotal += currentItem;
            }
        }

        // Getting additional inputs
        input.nextLine();
        System.out.print("Enter the day of the week: ");
        String day = input.nextLine();
        System.out.print("Enter hour (24-hours format): ");
        int hour = input.nextInt();
        input.nextLine();
        System.out.print("Is customer a member (Y/N)?: ");
        String member = input.nextLine();
        boolean isMember = (member.toLowerCase().charAt(0) == 'y') ? (true) : (false);

        // Generating receipt 
        System.out.println("\n--------- Kopi-Satu Receipt ----------");
        System.out.printf("%-30s: RM %6.2f\n", "Subtotal", subtotal); // Displaying subtotal

        // Calculating service tax
        int percentage;
        double serviceTax;
        if (subtotal > 100) {
            percentage = 10;
            serviceTax = subtotal * 0.10;
        } else if (subtotal > 30) {
            percentage = 8;
            serviceTax = subtotal * 0.08;
        } else {
            percentage = 6;
            serviceTax = subtotal * 0.06;
        }

        // Displaying service tax
        String serviceTaxMessage = "Service Tax (" + percentage + "%)";
        System.out.printf("%-30s: RM ", serviceTaxMessage);
        System.out.printf("%6.2f\n", serviceTax);        

        // Calculating total before discount
        double totalBeforeDiscount = subtotal + serviceTax;

        // Displaying total before discount
        System.out.printf("%-30s: RM %6.2f\n", "Total before dscount",  totalBeforeDiscount);

        // Checking for discounts
        String[] weekday = {"monday", "tuesday", "wednesday", "thursday", "friday"};

        // Checking if it's a weekday
        boolean isWeekday = false;
        for (int i = 0; i < weekday.length; i++) {
            if (day.toLowerCase().equals(weekday[i])) {
                isWeekday = true;
            }
        }

        // Calculating discounts
        int discount = 0;

        //  Student discount
        if ((isWeekday) && (totalBeforeDiscount > 25.00)) {
            System.out.printf("%-30s: RM ", "Student Discount (10%)");  
            System.out.printf("%6.2f\n", totalBeforeDiscount * 0.10);
            discount += totalBeforeDiscount * 0.10;
        }
        // Happy hour discount
        if ((isWeekday) && (hour >= 15) && (hour < 17)) {
            System.out.printf("%-30s: RM ", "Happy Hour Discount (5%)");   
            System.out.printf("%6.2f\n", (totalBeforeDiscount - discount) * 0.05);
            discount += totalBeforeDiscount * 0.05;
        }
        // Weekend combo discount
        if ((!isWeekday) && (subtotal > 50.00)) {
            System.out.printf("%-30s: RM ", "Weekend Combo Discount (5%)");
            System.out.printf("%6.2f\n", subtotal * 0.05);
            discount += subtotal * 0.05;
        }

        // Calculating total payable
        double totalPayable = totalBeforeDiscount - discount;
        System.out.println("-----------------------------------------");
        System.out.printf("%-30s: RM %6.2f\n", "Total Payable", totalPayable); // Displaying total payable

        // Calculating loyalty cashback
        if (isMember) { /// Checking if customer is a member
            System.out.printf("%-30s: RM %6.2f\n", "Loyalty Cashback (2%)", totalPayable * 0.02);
            totalPayable -= totalPayable * 0.02;
        }

        // Displaying final amount to collect
        System.out.println("-----------------------------------------");
        System.out.printf("%-30s: RM %6.2f\n", "Final Amount to Collect", totalPayable);

    }
}
