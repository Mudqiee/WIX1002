import java.util.Scanner;

public class L3Q6 {
    public static void main (String[] args) {

        // Write a program that asks users to enter the radius of a circle and a coordinate point
        // (x, y). Determine whether the point is inside or outside the circle centered at (0, 0).
        
        Scanner input = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = input.nextDouble();
        System.out.print("X-coordinate: ");
        double x = input.nextDouble();
        System.out.print("Y-coordinate: ");
        double y = input.nextDouble();

        if ((x * x) + (y * y) > (radius * radius)) {
            System.out.println("The point is outside of the circle.");
        } else {
            System.out.println("The point is inside of the circle.");
        }
        input.close();
    }    
}
