import java.util.Scanner;

public class L3Q3 {
    public static void main (String[] args) {

        // Write a program that calculates the total commission receives based on the table
        // below. The program will accept the sales volume and calculate the commission.
        // Display the commission in two decimal places.
        //____________________________________________________________________________
        //|             Sales Volume                         |       Commission       |
        //|Less than or equal to 100                         |  5%    of total sales  |
        //|Greater than 100 and less than or equal to 500    |  7.5%  of total sales  |
        //|Greater than 500 and less than or equal to 1000   |  10%   of total sales  |
        //|Greater than 1000                                 |  12.5% of total sales  |
        
        Scanner input = new Scanner(System.in);

        System.out.print("Sales volume: ");
        double sales_volume = input.nextDouble(), commission;

        if (sales_volume <= 100) {
            commission = sales_volume * 0.05;
        } else if (sales_volume <= 500) {
            commission = sales_volume * 0.075;
        } else if (sales_volume <= 1000) {
            commission = sales_volume * 0.10;
        } else {
            commission = sales_volume * 0.125;
        }
        
        System.out.printf("The commision: %.2f\n", commission);
        input.close();
    }
}
