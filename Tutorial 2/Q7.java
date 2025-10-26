import java.util.Scanner;

public class Q7 {
    public static void main (String[] args) {

        System.out.println("Enter the length in inches: ");
        Scanner input = new Scanner(System.in);
        double inches = input.nextDouble();

        System.out.printf("The length in cm is: %.2f\n meters", inches * 0.0254);
        input.close();
    }
}
