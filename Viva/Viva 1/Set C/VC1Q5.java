import java.util.Scanner;
import java.util.Random;

public class VC1Q5 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {
            
            // Getting the user input
            System.out.println("\n--- Spacecraft Performance Analyzer ---");
            System.out.print("Enter spacecraft name: ");
            String name = input.nextLine();
            if (name.equals("s")) {break;}
            System.out.print("Enter distance traveled (km): ");
            int distance = input.nextInt();
            if (distance < 0) {System.out.println("Invalid input."); break;}
            System.out.print("Enter fuel used (liters): ");
            int fuel = input.nextInt();
            if (fuel <= 0) {System.out.println("Invalid input."); break;}
            System.out.print("Enter spacecraft type (1-Rocket, 2-Shuttle, 3-Probe): ");
            int type = input.nextInt();

            // Displaying the name of the aircraft
            input.nextLine();
            System.out.println("\n*** Spacecraft Report ***");
            System.out.printf("Spacecraft: %s\n", name);

            // Determine the spacecraft  and display it
            switch(type) {
                case 1:
                    System.out.println("Type: Rocket");
                    break;
                case 2:
                    System.out.println("Type: Shuttle");
                    break;
                case 3:
                    System.out.println("Type: Probe");
                    break;
            }

            // Calculating the effienciency
            double efficiency = (double) distance / fuel;

            // Displaying the efficiency
            System.out.printf("Fuel efficiency: %.1f km/l\n", efficiency);

            // Classify the spacecraft's efficiency
            System.out.print("Performance: ");
            if (efficiency > 10) {
                System.out.println("Outstanding performance! Minimal fuel usage.");
            } else if (efficiency > 5) {
                System.out.println("Good performance! Efficient mission.");
            } else {
                System.out.println("Needs improvement! High fuel consumption.");
            }

            // Mission tips
            System.out.print("Mission Tip: ");
            switch (rand.nextInt(4)) {
                case 0:
                    System.out.println("Regular maintenance checks are essential.");
                    break;
                case 1:
                    System.out.println("Optimize flight paths to save fuel.");
                    break;
                case 2:
                    System.out.println("Ensure crew members are well-rested.");
                    break;
                case 3:
                    System.out.println("Keep communication systems updated.");
                    break;
            }

            System.out.println("Type \"s\" to exit the program");
        }
        input.close();
    }
}
