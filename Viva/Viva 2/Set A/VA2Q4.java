import java.util.Scanner;

public class VA2Q4 {
    
    public static double[] triangle;

    public static void main(String[] args) {

        triangle = getInput();
        isValid(triangle);
        calculateTriangle();
        displayTriangle(triangle);
    }

    static double[] getInput() {

        Scanner input = new Scanner(System.in);
        double type, A, B, C = 0, BC = 0, AC = 0, AB = 0, area = 0;

        System.out.print("Enter the type of triangle: ");
        String triangleType = input.next();

        if (triangleType.equals("SSS")) {
            type = 0;
            System.out.print("Side A: ");
            A = input.nextDouble();
            System.out.print("Side B: ");
            B = input.nextDouble();
            System.out.print("Side C: ");
            C = input.nextDouble();

            double[] triangle = {type, A, B, C, BC, AC, AB, area};
            return triangle;
        }
        if (triangleType.equals("SAS")) {
            type = 1;
            System.out.print("Side A: ");
            A = input.nextDouble();
            System.out.print("Included angle: ");
            AB = input.nextDouble();
            System.out.print("Side B: ");
            B = input.nextDouble();

            double[] triangle = {type, A, B, C, BC, AC, AB, area};
            return triangle;
        }

        double[] invalid = {0}; 
        return invalid;
    }

    static void isValid(double[] triangle) {

        if (triangle.length == 1) {
            System.out.println("Invalid Type\nType of triangle (SSS or SAS)");
            System.exit(1);
        }
        boolean triangleValidity = (
            (triangle[1] + triangle[2] <= triangle[3]) || 
            (triangle[1] + triangle[3] <= triangle[2]) || 
            (triangle[3] + triangle[2] <= triangle[1])
        );
        if (triangleValidity && (triangle[0] == 0)) {
            displayTriangle(triangle);
            System.out.println("Not a valid triangle");
            System.exit(1);
        }
    }

    static void displayTriangle(double[] triangle) {

        System.out.println("Triangle Info");
        System.out.printf("Side A: %.2f\n", triangle[1]);
        System.out.printf("Side B: %.2f\n", triangle[2]);
        System.out.printf("Side C: %.2f\n", triangle[3]);
        if (triangle[4] != 0) {
            System.out.printf("Angle BC: %.2f\n", triangle[4]);
            System.out.printf("Angle AC: %.2f\n", triangle[5]);
            System.out.printf("Angle AB: %.2f\n", triangle[6]);
            System.out.printf("Area of Triangle: %.2f\n", triangle[7]);
        }
    }

    static void calculateTriangle() {

        if (triangle[0] == 1) {
            triangle[3] = Math.sqrt((Math.pow(triangle[1], 2)) + (Math.pow(triangle[2], 2)) - (2 * triangle[1] * triangle[2] * Math.cos(Math.toRadians(triangle[6]))));
        }

        if (triangle[0] == 0) {
            triangle[6] = Math.toDegrees(Math.acos(((Math.pow(triangle[1], 2)) + (Math.pow(triangle[2], 2)) - (Math.pow(triangle[3], 2))) / (2 * triangle[1] * triangle[2])));
        }

        triangle[4] = Math.toDegrees(Math.acos(((Math.pow(triangle[2], 2)) + (Math.pow(triangle[3], 2)) - (Math.pow(triangle[1], 2))) / (2 * triangle[2] * triangle[3])));
        triangle[5] = Math.toDegrees(Math.acos(((Math.pow(triangle[1], 2)) + (Math.pow(triangle[3], 2)) - (Math.pow(triangle[2], 2))) / (2 * triangle[1] * triangle[3])));

        double s = (triangle[1] + triangle[2] + triangle[3]) / 2;
        triangle[7] = Math.sqrt(s * (s - triangle[1]) * (s - triangle[2]) * (s - triangle[3]));
    }
}
