import java.util.Scanner;

public class L2Q1 {
    public static void main (String[] args) {

        /*
        Write a program that convert the temperature in degree Fahrenheit to degree Celsius.
        The program will display the degree Celsius in two decimal places.
        Celsius = (Fahrenheit – 32) / 1.8
         */

        double fahrenheit, celcius;
        System.out.println("Enter the temperature in Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        fahrenheit = input.nextDouble();
        celcius = (fahrenheit - 32) / 1.8;
        System.out.printf("The temperature in celcius is %.2f\n", celcius);
        input.close();

    }
}
