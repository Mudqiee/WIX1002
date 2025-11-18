import java.util.Scanner;
import java.util.Random;

public class VC1Q1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double hoursStudied, hoursSlept;
        int breaksTaken;

        // Getting the user input
        while (true) {
            System.out.print("Enter hours studied: ");
            hoursStudied = input.nextDouble();
            System.out.print("Enter hours slept: ");
            hoursSlept = input.nextDouble();
            System.out.print("Enter breaks taken: ");
            breaksTaken = input.nextInt();

            if((hoursStudied >= 0) && (hoursStudied <= 24) && 
               (hoursSlept >= 0) && (hoursSlept <= 24) && 
               (breaksTaken >= 0) && (breaksTaken <= 10)) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        }

        // Calculate the productivity score
        double score = (hoursStudied * 8) + (hoursSlept * 3) - ((double)breaksTaken * 2);

        // Displaying the the score
        System.out.printf("Your productivity score is %.0f\n", score);

        // Determine the motivational message based on the score
        if (score > 60) {
            System.out.println("Excellent! Keep up with the great work!");
        } else if ((score <= 60) && (score >= 30)) {
            System.out.println("Good effort, but balance your breaks!");
        } else {
            System.out.println("Try to plan your day better!");
        }

        // Determine the tip of the day message using random
        System.out.print("Tip of the Day: ");
        Random rand = new Random();
        switch (rand.nextInt(4)) {
            case 0:
                System.out.println("Revise your notes before sleeping.");
                break;
            case 1:
                System.out.println("Avoid using social media");
                break;
            case 2:
                System.out.println("Do your assignment early!");
                break;
            case 3:
                System.out.println("Focus on your class");
                break;
        }
    }
}
