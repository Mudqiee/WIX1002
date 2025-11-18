import java.util.Scanner;
import java.util.Random;

public class VC1Q6 {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Getting the user input for each day
        int totalStep = 0;
        int highestStep = 0;
        int highestDay = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Enter steps for Day %d: ", i);
            int currentStep = input.nextInt();
            // If unrealistic step count entered, reenter the input
            if ((currentStep < 0) || (currentStep > 50000)) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
            // Keep track the highest step
            if (currentStep > highestStep) {
                highestStep = currentStep;
                highestDay = i;
            }
            // Adding the sum of the steps throughout the week
            totalStep += currentStep;
        }

        // Calculating the average of the step daily
        double averageStep = (double) totalStep / 7;

        // Displaying the results
        System.out.printf("Total Steps This Week: %d\n", totalStep);
        System.out.printf("Average Daily Steps: %.2f\n", averageStep);
        System.out.printf("Most Active Day: Day %d with %d steps\n", highestDay, highestStep);

        // Determining the motivational message
        if (totalStep >= 70000) {
            System.out.println("Amazing! You're smashing your goals!");
        } else if (totalStep >= 40000) {
            System.out.println("Good job! Keep pushing for consistency!");
        } else {
            System.out.println("You can do better, small steps daily make a big difference!");
        }

        // Healthy tips of the day
        Random rand = new Random();
        switch (rand.nextInt(5)) {
            case 0:
                System.out.println("Tip: Take the stairs instead of the elevator.");
                break;
            case 1:
                System.out.println("Tip: Go for a walk during your lunch break.");
                break;
            case 2:
                System.out.println("Tip: Park further away to increase your step count.");
                break;
            case 3:
                System.out.println("Tip: Set a reminder to stand up and stretch every hour.");
                break;
            case 4:
                System.out.println("Tip: Walk while talking on the phone.");
                break;
        }

        input.close();
    }
}
