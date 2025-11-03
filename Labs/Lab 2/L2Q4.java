import java.util.Scanner;

public class L2Q4 {
    public static void main (String[] args) {

        //Write a program that converts the seconds to hours, minutes and seconds.
        System.out.print("Enter the number of seconds: ");
        Scanner input = new Scanner(System.in);
        
        int seconds = input.nextInt();
        System.out.printf("%d seconds is ", seconds);
        int hours = seconds / 3600;
        int minutes = (seconds - (hours * 3600)) / 60;
        seconds = seconds - (hours * 3600) - (minutes * 60);

        System.out.printf("%d hours, ", hours);
        System.out.printf("%d minutes and ", minutes);
        System.out.printf("%d seconds\n", seconds);

        input.close();
    }
}
