import java.util.Scanner;

public class L3Q5 {
    public static void main (String[] args) {
        
        // Cramer’s rule is used to solve the linear equations.
        // ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
        // Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x
        // and y. If ad – bc is equal to 0. Display "The equation has no solution"

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value c: ");
        double c = input.nextDouble();
        System.out.print("Enter the value d: ");
        double d = input.nextDouble();
        System.out.print("Enter the value e: ");
        double e = input.nextDouble();
        System.out.print("Enter the value f: ");
        double f = input.nextDouble();

        double denominator = a * d - b * c;

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            System.out.printf("The solution is:\nx = %.2f\ny = %.2f\n", x, y);
        }
        input.close();
    }
} 
