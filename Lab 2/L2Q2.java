import java.util.Scanner;

public class L2Q2 {
    public static void main (String[] args) {

        /*
        Write a program to calculate the monthly payment for car loan. The following are the
        inputs of the program. Output the monthly payment in two decimal places.
        P The price of the car
        D Down payment
        R Interest Rate in %
        Y Loan duration in year
        M Monthly Payment
        M = (P – D) * (1 + R*Y/100) / (Y *12)
         */

        int year;
        double price, down_payment, interest_rate, monthly_payment;

        Scanner input = new Scanner(System.in);
        System.out.print("Price: ");
        price = input.nextDouble();

        System.out.print("Down payment: ");
        down_payment = input.nextDouble();

        System.out.print("Interest rate: ");
        interest_rate = input.nextDouble();

        System.out.print("Years: ");
        year = input.nextInt();

        monthly_payment = (price - down_payment) * (1 + interest_rate * year / 100) / (year * 12);
        System.out.printf("Monthly payment: %.2f\n", monthly_payment);

        input.close();

    }
}
