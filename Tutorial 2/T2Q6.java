import java.util.Scanner;

public class T2Q6 {
    public static void main (String[] args) {

        double diameter;
        System.out.println("Enter diameter: ");

        Scanner input = new Scanner(System.in);
        diameter = input.nextDouble();

        System.out.printf("The circumference: %.3f\n", diameter);

        input.close();
    }
}
