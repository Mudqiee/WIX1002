import java.util.Scanner;

public class T3Q4 {
    public static void main (String[] args) {
        //Write the java statements that used the if statement to find the biggest number among three given integers.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        System.out.print("Enter third integer: ");
        int z = input.nextInt();
        input.close();

        if ((x > y) && (x > z)) {
            System.out.printf("%d is the biggest number.\n", x);
        } else if (y > z) {
            System.out.printf("%d is the biggest number.\n", y);
        } else {
            System.out.printf("%d is the biggest number.\n", z);
        }

    }
}
