import java.util.Scanner;

public class VC1Q3 {

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        // Iterate through the binary string from right to left 
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                // Manually calculate 2^power
                int twoPower = 1;
                for (int j = 0; j < power; j++) {
                    twoPower *= 2;
                }
                decimal += twoPower;
            }
            // If it's '0', we add 0, so no action is needed
            power++;
        }
        return decimal;
    }

    public static boolean isValidBinary(String code) {
        // Check for non-empty string and ensure all characters are '0' or '1'
        if (code.isEmpty()) {
            return false;
        }
        for (char c : code.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to store team data
        int ironManCount = 0;
        int captainAmericaCount = 0;
        long ironManTotalPower = 0;
        long captainAmericaTotalPower = 0;
        final int MAX_CODES = 20;
        int totalCodesProcessed = 0;

        System.out.println("Enter binary code (type 'STOP' to finish):");

        // Main input loop, controlled by 'STOP' or MAX_CODES
        while (totalCodesProcessed < MAX_CODES) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("STOP")) {
                break;
            }

            // Validation
            if (!isValidBinary(input)) {
                System.out.println("Invalid code: must contain only 0s and 1s");
                continue;
            }

            // 1. Conversion
            int decimal = binaryToDecimal(input);
            String team;

            // 2. Classification
            if (decimal % 2 == 0) {
                // Even -> Iron Man's Team
                team = "Iron Man's Team";
                ironManCount++;
                ironManTotalPower += decimal;
            } else {
                // Odd -> Captain America's Team
                team = "Captain America's Team";
                captainAmericaCount++;
                captainAmericaTotalPower += decimal;
            }

            // Display intermediate result (per sample output)
            System.out.println("Code " + input + " -> Decimal " + decimal + " -> " + team);
            
            // Increment the counter for the MAX_CODES constraint
            totalCodesProcessed++;
        }

        System.out.println("---");

        // 3. Final Stats and Team Analysis
        
        // Calculate average power
        double ironManAveragePower = 0;
        if (ironManCount > 0) {
            // Calculate and round the average power
            ironManAveragePower = (double) ironManTotalPower / ironManCount;
        }

        double captainAmericaAveragePower = 0;
        if (captainAmericaCount > 0) {
            // Calculate and round the average power
            captainAmericaAveragePower = (double) captainAmericaTotalPower / captainAmericaCount;
        }
        
        // Display final stats
        System.out.println("Iron Man Team: " + ironManCount + " codes | Average Power: " + Math.round(ironManAveragePower));
        System.out.println("Captain America Team: " + captainAmericaCount + " codes | Average Power: " + Math.round(captainAmericaAveragePower));
        System.out.println("Mission Accomplished: Message Decrypted!");

        scanner.close();
    }
}