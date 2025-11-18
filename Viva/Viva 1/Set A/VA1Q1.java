import java.util.Scanner;

public class VA1Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inquiries;

        // Getting the number of inquiries
        while (true) {
            System.out.print("Enter the number of inquiries (1 - 500): ");
            inquiries  = input.nextInt();

            // Getting the input again if the user enter the invalid number of inquiries.
            // The number of inquiries must be in between [1, 500]
            if ((inquiries >= 1) && (inquiries <= 500)) {
                break;
            } else {
                System.out.println("Invalid number of inqiuries!! Please try again.");
            }
        }

        // Looping through the number of inquiries
        for (int i = 0; i < inquiries; i++) {
            int initialValue, multiplierSeed, charmLength;
            
            // Getting the user input for the initial value, multiplier seed and the charm length
            while (true) {
                System.out.print("Enter the following,\nInitial Value: ");
                initialValue = input.nextInt();
                System.out.print("Multiplier Seed: ");
                multiplierSeed = input.nextInt();
                System.out.print("Charm length: ");
                charmLength = input.nextInt();

                //Check if the input is valid or not
                // Initial Value & Multiplier Seed must be in between [0, 50]
                // Charm Length must be in between [1, 15]
                if((initialValue >= 0) && (initialValue <= 50) && (multiplierSeed >= 0) && (multiplierSeed <= 50) && (charmLength >= 1) && (charmLength <= 15)) {
                    break;
                } else {
                    System.out.println("Invalid input! Please try again,");
                    System.out.println("Initial Value & Multiplier Seed: 0 - 50");
                    System.out.println("Charm Length: 1 - 15");
                }
            }

            // Calculating the values for each itiration until the charmLength
            for (int j = 0; j < charmLength; j++){
                int value = initialValue + (multiplierSeed * (int) Math.pow(2, j));
                System.out.print(value);
                // Only print in between values
                if (j < charmLength - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
